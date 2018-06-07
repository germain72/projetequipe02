package filrouge.jeu.DAO;

import java.util.List;

import filrouge.jeu.bean.Partie;

public interface IListePartiesDAO {

	List<Partie> rechercherParties();
	
	void creerPartie(final Partie pPartie);
	
	void supprimerPartie (final Partie pPartie);
	
	void modifierParties (final Partie pPartie);
	
}
