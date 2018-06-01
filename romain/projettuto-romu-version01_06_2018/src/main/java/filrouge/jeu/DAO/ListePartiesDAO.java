package filrouge.jeu.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import filrouge.jeu.bean.Partie;

@Repository
public class ListePartiesDAO implements IListePartiesDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	public List<Partie> rechercherPartie() {
		final CriteriaBuilder lCriteriaBuilder = entityManager.getCriteriaBuilder();

		final CriteriaQuery<Partie> lCriteriaQuery = lCriteriaBuilder.createQuery(Partie.class);
		final Root<Partie> lRoot = lCriteriaQuery.from(Partie.class);
		lCriteriaQuery.select(lRoot);
		final TypedQuery<Partie> lTypedQuery = entityManager.createQuery(lCriteriaQuery);

		return lTypedQuery.getResultList();
	}

	public void creerPartie(Partie pPartie) {
		entityManager.persist(pPartie);		
	}

	public void supprimerPartie(Partie pPartie) {
		final Partie lPartie = entityManager.getReference(Partie.class, pPartie.getIdPartie());
		entityManager.remove(lPartie);
	}

	public void modifierPartie(Partie pPartie) {
		// TODO Auto-generated method stub
		
	}

}
