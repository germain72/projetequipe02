package filrouge.admin.controller;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class ModifierClientForm {

	private Integer idclient;
	private String nomclient;
	private String prenomclient;
	@Valid
	@NotEmpty(message = "")
	@Pattern(regexp = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)", message = "Date jj/mm/aaaa requise")
	private String naissanceclient;
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

	public String getNaissanceclient() {
		return naissanceclient;
	}

	public void setNaissanceclient(final String pNaissance) {
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
