package filrouge.jeu.controller;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class ModifierRessourcesForm {

	@NotNull
    private Integer id;
	
	@NotEmpty
	private String libelle;

	@NotNull
    private Integer typeRessource;

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = new Integer(id);
	}
	public void setId(String id) {
		this.id = new Integer(id);
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Integer getTypeRessource() {
		return typeRessource;
	}
	public void setTypeRessource(Integer typeRessource) {
		this.typeRessource = typeRessource;
	}
	public void setTypeRessource(int typeRessource) {
		this.typeRessource = new Integer(typeRessource);
	}
	public void setTypeRessource(String typeRessource) {
		this.typeRessource = new Integer(typeRessource);
	}
}
