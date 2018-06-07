package filrouge.jeu.controller;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class ModificationPartie {
	
	private Integer idpartie;
	private String nom;
	@NotEmpty(message="{modification.partie.date.notempty")
	private Date date;
	
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
	
	public Date getDate () {
		return date;
	}
	
	public void setDate(final Date pDate) {
		this.date=pDate;
	}

}
