package filrouge.jeu.services;

import java.util.List;

import filrouge.jeu.bean.Joueur;

public interface IServiceListeJoueurs {
	
	List<Joueur> rechercherJoueurs();
	
	void creerJoueur(final String pNom);
	
	void supprimerJoueur(final Integer pIdJoueur);
	
	void modifierJoueurs(final List<Joueur> pListeJoueurs);
}