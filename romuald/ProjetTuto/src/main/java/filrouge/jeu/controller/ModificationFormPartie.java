package filrouge.jeu.controller;

import java.util.List;

import javax.validation.Valid;

public class ModificationFormPartie {

	@Valid
	private List<ModificationPartie> listeParties;

	public void setListeParties(final List<ModificationPartie> pListeParties) {
		listeParties = pListeParties;
	}

	public List<ModificationPartie> getListeParties() {
		return listeParties;
	}

}
