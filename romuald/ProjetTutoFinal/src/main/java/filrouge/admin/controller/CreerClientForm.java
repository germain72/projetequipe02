package filrouge.admin.controller;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class CreerClientForm {
	private String nom;
	private String prenom;
	@Valid
	@NotEmpty(message = "")
	@Pattern(regexp = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)", message = "Date jj/mm/aaaa requise")
	private String naissance;
	private String date = DateTime.getStringFormat(new Date(),"");
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

	public String getNaissance() {
		if (naissance != null) {
			return naissance;
		}
		return date;
	}

	public void setNaissance(final String pNaissance) {
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

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(final boolean pAdmin) {
		this.admin = pAdmin;
	}

}
