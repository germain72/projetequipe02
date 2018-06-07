package filrouge.jeu.controller;

import java.time.LocalDate;
import java.util.Date;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import javax.validation.constraints.Past;

public class CreationFormPartie {
	
	@Valid
	@NotEmpty
	private String nom;


	@NotEmpty(message="{creation.partie.date.notempty}")
	@DateTimeFormat(pattern="dd/MM/yyyy")
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
