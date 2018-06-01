package filrouge.jeu.controller;

import org.hibernate.validator.constraints.NotEmpty;

public class CreationFormJoueur {
	
	@NotEmpty
	private String nom;
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(final String pNom) {
		nom = pNom;
	}

}
