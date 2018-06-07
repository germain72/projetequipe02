package filrouge.admin.controller;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class ModifierClientForm {

	private Integer idclient;
	private String nomclient;
	private String prenomclient;
	@NotEmpty
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date naissanceclient;
	@NotEmpty
	private String pseudoclient;
	@NotEmpty
	private String mdpclient;
	private boolean admin;

	public Integer getIdclient() {
		return idclient;
	}

	public void setIdclient(final Integer pId) {
		idclient = pId;
	}

	public String getNomclient() {
		return nomclient;
	}

	public void setNomclient(final String pNom) {
		nomclient = pNom;
	}

	public String getPrenomclient() {
		return prenomclient;
	}

	public void setPrenomclient(final String pPrenom) {
		prenomclient = pPrenom;
	}

	public Date getNaissanceclient() {
		return naissanceclient;
	}

	public void setNaissanceclient(final Date pNaissance) {
		naissanceclient = pNaissance;
	}

	public String getPseudoclient() {
		return pseudoclient;
	}

	public void setPseudoclient(final String pPseudo) {
		pseudoclient = pPseudo;
	}

	public String getMdpclient() {
		return mdpclient;
	}

	public void setMdpclient(final String pMdp) {
		mdpclient = pMdp;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(final boolean pAdmin) {
		admin = pAdmin;
	}
}
