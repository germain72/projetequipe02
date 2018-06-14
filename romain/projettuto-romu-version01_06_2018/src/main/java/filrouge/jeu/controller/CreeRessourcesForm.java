package filrouge.jeu.controller;

//import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotEmpty;

public class CreeRessourcesForm {

	@NotEmpty
	private String libelle;

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(final String pLibelle) {
		libelle = pLibelle;
	}
}
