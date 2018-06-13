package filrouge.jeu.services;

import java.util.List;

import filrouge.jeu.bean.Ressources;

public interface IServiceListeRessources {

	List<Ressources> listRessources();
	
	Ressources getRessourcesById(final int id);
//
//	Ressources getRessourcesByEnumType(final int id);
	
	void creerRessources (final Ressources pRessources);
	
	void creerRessources (final String libebelle,final int typeRessource);
	
	void supprimerRessources(final Ressources pRessources);
	
	void modifierRessources(final List<Ressources> pRessources);
}
