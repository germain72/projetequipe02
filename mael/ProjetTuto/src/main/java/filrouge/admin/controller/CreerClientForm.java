package filrouge.admin.controller;

import org.hibernate.validator.constraints.NotEmpty;

public class CreerClientForm {
	private String nom;
	private String prenom;
	private String naissance;
	@NotEmpty
	private String pseudo;
	@NotEmpty
	private String mdp;
	private boolean admin;
	
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

}
