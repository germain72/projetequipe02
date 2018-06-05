package filrouge.jeu.controller;

import java.util.List;

import javax.validation.Valid;

public class ModificationFormJoueur {

	@Valid
	private List<ModificationJoueur> listeJoueurs;

	public void setListeJoueurs(final List<ModificationJoueur> pListeJoueurs) {
		listeJoueurs = pListeJoueurs;
	}

	public List<ModificationJoueur> getListeJoueurs() {
		return listeJoueurs;
	}

}
