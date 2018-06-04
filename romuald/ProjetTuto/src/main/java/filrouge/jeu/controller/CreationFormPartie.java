package filrouge.jeu.controller;

import java.util.Date;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class CreationFormPartie {

	@NotEmpty
	private String nom;

	@Valid
	@NotEmpty
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date date;
	
	public String getNom() {
		return nom;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setNom(final String pNom) {
		nom = pNom;
	}
	
	public void setDate(final Date pDate) {
		date = pDate;
		
	}

}
