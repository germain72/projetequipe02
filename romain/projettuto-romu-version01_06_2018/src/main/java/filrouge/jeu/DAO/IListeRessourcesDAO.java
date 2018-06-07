package filrouge.jeu.DAO;

import java.util.List;

import filrouge.jeu.bean.Ressources;

public interface IListeRessourcesDAO {

	/*
	 * Retourne la liste des ressources de la bbd
	 */
	List<Ressources> listRessources();
	
	/*
	 *  Crée une nouvelle entrée de la class "Ressources" dans la bbd
	 */
	void creerRessources (final Ressources pRessources);
	
	/*
	 * Supprime une entrée de la class ressource dans la bbd
	 */
	void supprimerRessources(final Ressources pRessources);
	
	/*
	 * Change une entree de la class Ressources dans la bbd, en utilisent l'id pour identifier la Ressources à metre à jour
	 */
	void modifierRessources(final Ressources pRessources);
}
