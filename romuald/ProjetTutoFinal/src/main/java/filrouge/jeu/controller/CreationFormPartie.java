package filrouge.jeu.controller;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class CreationFormPartie {
	
	@Valid
	@NotEmpty
	private String nom;


	@NotEmpty(message="{creation.partie.date.notempty}")
	@Pattern (regexp="(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)")
	private String date;
	
	public String getNom() {
		return nom;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setNom(final String pNom) {
		nom = pNom;
	}
	
	public void setDate(final String pDate) {
		date = pDate;
		
	}

}
