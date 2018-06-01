package filrouge.jeu.services;

import java.util.List;

import filrouge.jeu.bean.Partie;

public interface IServiceListeParties {
	
	List<Partie> rechercherPartie();
	
	void creerPartie (final String pNom);
	
	void supprimerPartie (final Integer pIdPartie);

}
