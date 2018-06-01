package filrouge.admin.controller;

import java.util.Date;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class CreerClientForm {
	private String nom;
	private String prenom;
	private Date naissance;
	@NotEmpty
	private String pseudo;
	@NotEmpty
	private String mdp;
	private boolean admin;

	public String getNom() {
		return nom;
	}

	public void setNom(final String pNom) {
		this.nom = pNom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(final String pPrenom) {
		this.prenom = pPrenom;
	}

	public Date getNaissance() {
		return naissance;
	}

	public void setNaissance(final Date pNaissance) {
		this.naissance = pNaissance;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(final String pPseudo) {
		pseudo = pPseudo;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(final String pMdp) {
		mdp = pMdp;
	}

	public boolean getAdmin() {
		return admin;
	}

	public void setAdmin(final boolean pAdmin) {
		this.admin = pAdmin;
	}

}
