package filrouge.jeu.DAO;

import java.util.List;

import filrouge.jeu.bean.Ressources;

public interface IListeRessourcesDAO {

	List<Ressources> rechercherRessources();
	
	void creerRessources (final Ressources pRessources);
	
	void supprimerRessources(final Ressources pRessources);
	
	void modifierRessources(final Ressources pRessources);
}
