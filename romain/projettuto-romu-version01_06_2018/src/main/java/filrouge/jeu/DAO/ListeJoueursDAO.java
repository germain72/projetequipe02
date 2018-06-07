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
import filrouge.jeu.bean.Joueur;

@Repository
public class ListeJoueursDAO implements IListeJoueursDAO {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Joueur> rechercherJoueurs() {
		final CriteriaBuilder lCriteriaBuilder = entityManager.getCriteriaBuilder();

		final CriteriaQuery<Joueur> lCriteriaQuery = lCriteriaBuilder.createQuery(Joueur.class);
		final Root<Joueur> lRoot = lCriteriaQuery.from(Joueur.class);
		lCriteriaQuery.select(lRoot);
		final TypedQuery<Joueur> lTypedQuery = entityManager.createQuery(lCriteriaQuery);

		return lTypedQuery.getResultList();

	}

	public void creerJoueur(final Joueur pJoueur) {
		entityManager.persist(pJoueur);
	}

	public void supprimerJoueur(final Joueur pJoueur) {
		final Joueur lJoueur = entityManager.getReference(Joueur.class, pJoueur.getIdJoueur());
		entityManager.remove(lJoueur);
	}

	public void modifierJoueur(final Joueur pJoueur) {
			final CriteriaBuilder lCriteriaBuilder = entityManager.getCriteriaBuilder();

			final CriteriaUpdate<Joueur> lCriteriaUpdate = lCriteriaBuilder.createCriteriaUpdate(Joueur.class);
			final Root<Joueur> lRoot = lCriteriaUpdate.from(Joueur.class);
			final Path<Joueur> lPath = lRoot.get("idJoueur");
			final Expression<Boolean> lExpression = lCriteriaBuilder.equal(lPath, pJoueur.getIdJoueur());
			lCriteriaUpdate.where(lExpression);
			lCriteriaUpdate.set("nom", pJoueur.getNom());
			final Query lQuery = entityManager.createQuery(lCriteriaUpdate);
			final int lRowCount = lQuery.executeUpdate();
			
			if (lRowCount != 1) {
			final org.hibernate.Query lHQuery = lQuery.unwrap(org.hibernate.Query.class);
			final String lSql = lHQuery.getQueryString();
			
			throw new RuntimeException("Nombre d'occurences (" + lRowCount +
        		   ") modifiés différent de 1 pour " + lSql+" id:"+pJoueur.getIdJoueur());
           }
}
	}

