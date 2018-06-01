package filrouge.jeu.DAO;

import java.util.List;

import filrouge.jeu.bean.Joueur;

public interface IListeJoueursDAO {
	
	List<Joueur> rechercherJoueurs();
	
	void creerJoueur (final Joueur pJoueur);
	
	void supprimerJoueur(final Joueur pJoueur);
	
	void modifierJoueur(final Joueur pJoueur);
	
}