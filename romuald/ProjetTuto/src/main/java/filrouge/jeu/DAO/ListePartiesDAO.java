package filrouge.jeu.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import filrouge.jeu.bean.Partie;

@Repository
public class ListePartiesDAO implements IListePartiesDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	public List<Partie> rechercherParties() {
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

	public void modifierParties(Partie pPartie) {
		final CriteriaBuilder lCriteriaBuilder = entityManager.getCriteriaBuilder();

		final CriteriaUpdate<Partie> lCriteriaUpdate = lCriteriaBuilder.createCriteriaUpdate(Partie.class);
		final Root<Partie> lRoot = lCriteriaUpdate.from(Partie.class);
		final Path<Partie> lPath = lRoot.get("idPartie");
		final Expression<Boolean> lExpression = lCriteriaBuilder.equal(lPath, pPartie.getIdPartie());
		lCriteriaUpdate.where(lExpression);
		lCriteriaUpdate.set("nom", pPartie.getNom());
		lCriteriaUpdate.set("date", pPartie.getDate());
		final Query lQuery = entityManager.createQuery(lCriteriaUpdate);
		final int lRowCount = lQuery.executeUpdate();
		
		if (lRowCount != 1) {
		final org.hibernate.Query lHQuery = lQuery.unwrap(org.hibernate.Query.class);
		final String lSql = lHQuery.getQueryString();
		
		throw new RuntimeException("Nombre d'occurences (" + lRowCount +
    		   ") modifiés différent de 1 pour " + lSql+" id:"+pPartie.getIdPartie());
		}
	}
}
