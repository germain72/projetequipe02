package filrouge.jeu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import filrouge.jeu.DAO.IListeJoueursDAO;
import filrouge.jeu.bean.Joueur;

@Service
public class ServiceListeJoueurs implements IServiceListeJoueurs {

	@Autowired
	private IListeJoueursDAO dao;

	@Transactional(readOnly = true)
	public List<Joueur> rechercherJoueurs() {
		return dao.rechercherJoueurs();

	}

	@Transactional
	public void creerJoueur(final String pNom) {
		final Joueur lJoueur = new Joueur();
		lJoueur.setNom(pNom);

		dao.creerJoueur(lJoueur);
	}

	@Transactional
	public void supprimerJoueur(final Integer pIdJoueur) {
		final Joueur lJoueur = new Joueur();
		lJoueur.setIdJoueur(pIdJoueur);
		dao.supprimerJoueur(lJoueur);

	}

	@Transactional 
	public void modifierJoueurs(final List<Joueur> pListeJoueurs) {
		for (final Joueur lJoueur : pListeJoueurs) {
			dao.modifierJoueur(lJoueur);
		}
	}
}