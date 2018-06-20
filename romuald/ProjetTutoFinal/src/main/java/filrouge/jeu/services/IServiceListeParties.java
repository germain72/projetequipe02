package filrouge.jeu.services;

import java.util.Date;
import java.util.List;

import filrouge.jeu.bean.Partie;

public interface IServiceListeParties {
	
	List<Partie> rechercherParties();
	
	void creerPartie (final String pNom, Date pDate);
	
	void supprimerPartie (final Integer pIdPartie);
	
	void modifierParties (final List<Partie> pListeParties);

}
