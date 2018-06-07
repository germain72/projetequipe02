package filrouge.jeu.DAO;

import java.util.List;

import javax.persistence.*;
import javax.persistence.criteria.*;
//import org.hibernate.Query;

import org.springframework.stereotype.Repository;

import filrouge.jeu.bean.Ressources;

@Repository
public class ListeRessourcesDAO implements IListeRessourcesDAO {
	
	@PersistenceContext
	private EntityManager em;

	// lObject lecture objetc
	
	/*
	 * (non-Javadoc)
	 * @see filrouge.jeu.DAO.IListeRessourcesDAO#listRessources()
	 */
	public List<Ressources> listRessources() {

		final CriteriaBuilder lCriteriaBuilder = em.getCriteriaBuilder();
		
		final CriteriaQuery<Ressources> lCriteriaQuery = lCriteriaBuilder.createQuery(Ressources.class);
		
		final Root<Ressources> lRoot = lCriteriaQuery.from(Ressources.class);
		
		lCriteriaQuery.select(lRoot);
		
		final TypedQuery<Ressources> lTypedQuery = em.createQuery(lCriteriaQuery);
		
		return lTypedQuery.getResultList();
		
	}
	
//	public Ressources getRessourcesById(final int pId) {
//
//		final CriteriaBuilder lCriteriaBuilder = em.getCriteriaBuilder();
//			
//		final CriteriaQuery<Ressources> lCriteriaQuery = lCriteriaBuilder.createQuery(Ressources.class);
//		
//		final Root<Ressources> lRoot = lCriteriaQuery.from(Ressources.class);
//		
//		lCriteriaQuery.select(lRoot);
//		
//		final TypedQuery<Ressources> lTypedQuery = em.createQuery(lCriteriaQuery);
//		
//		return lTypedQuery.getResultList();
//		
//	}
	
	/*
	 * (non-Javadoc)
	 * @see filrouge.jeu.DAO.IListeRessourcesDAO#creerRessources(filrouge.jeu.bean.Ressources)
	 */
	public void creerRessources(Ressources pRessources) {

		em.persist(pRessources);
	}

	/*
	 * (non-Javadoc)
	 * @see filrouge.jeu.DAO.IListeRessourcesDAO#supprimerRessources(filrouge.jeu.bean.Ressources)
	 */
	public void supprimerRessources(Ressources pRessources) {

		
		// dRessources et l'entytée de la base de donnée
		// nous obtenon cette entrée pour nous assuée que le entité existe biens
		final Ressources dRessources = em.getReference(Ressources.class, pRessources);
		em.remove(dRessources);
	}

	/*
	 * (non-Javadoc)
	 * @see filrouge.jeu.DAO.IListeRessourcesDAO#modifierRessources(filrouge.jeu.bean.Ressources)
	 */
	public void modifierRessources(Ressources pRessources) {

		final CriteriaBuilder lCriteriaBuilder = em.getCriteriaBuilder();
		
		final CriteriaUpdate<Ressources> lCriteriaUpdate = lCriteriaBuilder.createCriteriaUpdate(Ressources.class);
		
		final Root<Ressources> lRoot = lCriteriaUpdate.from(Ressources.class);
		
		final Path<Ressources> lPath = lRoot.get("id");
		
		final Expression<Boolean> lExpression = lCriteriaBuilder.equal(lPath, pRessources.getId());
		
		lCriteriaUpdate.where(lExpression);
		
		lCriteriaUpdate.set("LIBEBELLE", pRessources.getLibebelle());
		//Ressources.class.getMethod(getLibebelle, parameterTypes)
		
		// TODO De quelle donné s'agitile
		lCriteriaUpdate.set("TYPE_RESSOURCE", pRessources.getTypeRessource());
		
		final Query lQuery = em.createQuery(lCriteriaUpdate);
		
		final int lRowCount = lQuery.executeUpdate();
		
		if (lRowCount != 1) {
			final org.hibernate.Query lHQuery = lQuery.unwrap(org.hibernate.Query.class);
			final String lSQL = lHQuery.getQueryString();
			throw new RuntimeException("Nombre d'occurences (" + lRowCount + ") modifiés différent de 1 pour " + lSQL);
		}
	}

}
