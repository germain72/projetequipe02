package filrouge.jeu.controller;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class ModificationPartie {
	
	private Integer idpartie;
	private String nom;
	@NotEmpty(message="{modification.partie.date.notempty")
	@Pattern (regexp="(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)")
	private String date;
	
	public Integer getIdPartie () {
		return idpartie;
	}
	
	public void setIdpartie(final Integer pIdpartie) {
		idpartie = pIdpartie;
	}
	public String getNom () {
		return nom;
	}
	
	public void setNom(final String pNom) {
		nom = pNom;
	}
	
	public String getDate () {
		return date;
	}
	
	public void setDate(final String pDate) {
		this.date=pDate;
	}

}
