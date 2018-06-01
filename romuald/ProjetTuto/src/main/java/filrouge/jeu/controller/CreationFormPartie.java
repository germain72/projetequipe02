package filrouge.jeu.controller;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class CreationFormPartie {

	@NotEmpty
	private String nom;

	@NotEmpty
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
	
	public void setDate(final Calendar pDate) {
		Calendar pdate = Calendar.getInstance();
		
	}

}
