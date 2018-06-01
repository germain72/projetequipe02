package filrouge.jeu.controller;

import org.hibernate.validator.constraints.NotEmpty;

public class ModificationJoueur {

	private Integer idjoueur;
	@NotEmpty(message = "{modification.joueur.nom.notempty}")
	private String nom;

	public Integer getIdjoueur() {
		return idjoueur;
	}

	public void setIdjoueur(final Integer pIdjoueur) {
		idjoueur = pIdjoueur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(final String pNom) {
		nom = pNom;
	}
}