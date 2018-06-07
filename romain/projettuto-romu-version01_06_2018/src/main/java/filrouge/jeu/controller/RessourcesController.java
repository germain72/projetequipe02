package filrouge.jeu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import filrouge.jeu.bean.Ressources;
import filrouge.jeu.services.IServiceListeRessources;

@Controller
public class RessourcesController {

	@Autowired
	private IServiceListeRessources service;

	// AfficherListe
	@RequestMapping(value = "/afficherListeRessources", method = RequestMethod.GET)
	public String afficher(ModelMap pModel) {
		final List<Ressources> lListeRessources = service.listRessources();
		pModel.addAttribute("listeRessources", lListeRessources);
		return "listeRessources";
	}
	
	// CreeRessources
	@RequestMapping(value = "/creeRessources", method = RequestMethod.GET)
	public String cree(/*ModelMap pModel*/) {
//		final List<Ressources> lListeRessources = service.listRessources();
//		pModel.addAttribute("listeRessources", lListeRessources);
		return "creeRessources";
	}
	@RequestMapping(value = "/creeActionRessources", method = RequestMethod.POST)
	public String creeAction(ModelMap pModel) {
		final List<Ressources> lListeRessources = service.listRessources();
		pModel.addAttribute("listeRessources", lListeRessources);
		return "null";
	}
	// Modifierliste
//	@RequestMapping(value = "/modifierListeRessources", method = RequestMethod.GET)
//	public String modifier(ModelMap pModel) {
//		final List<Ressources> lListeRessources = service.listRessources();
//		pModel.addAttribute("listeRessources", lListeRessources);
//		return "modifierListeRessources";
//	}
}
