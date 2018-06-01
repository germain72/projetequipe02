package filrouge.jeu.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.stereotype.Repository;

import filrouge.jeu.bean.Ressources;

@Repository
public class ListeRessourcesDAO implements IListeRessourcesDAO {
	
	@PersistenceContext
	private EntityManager em;

	public List<Ressources> rechercherRessources() {
		// TODO Auto-generated method stub
		final CriteriaBuilder lCriteriaBuilder = em.getCriteriaBuilder();
		
		final CriteriaQuery<Ressources> lCriteriaQuery = lCriteriaBuilder.createQuery(Ressources.class);
		
	}

	public void creerRessources(Ressources pRessources) {
		// TODO Auto-generated method stub

	}

	public void supprimerRessources(Ressources pRessources) {
		// TODO Auto-generated method stub

	}

	public void modifierRessources(Ressources pRessources) {
		// TODO Auto-generated method stub

	}

}
