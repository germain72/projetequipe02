package filrouge.jeu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import filrouge.jeu.bean.Joueur;
import filrouge.jeu.bean.Ressources;
import filrouge.jeu.services.IServiceListeRessources;

@Controller
@RequestMapping(value="/afficherListeRessources")
public class AfficherListeRessourcesController {

	@Autowired
	IServiceListeRessources service;

	@RequestMapping(method=RequestMethod.GET)
	public String afficher(ModelMap pModel)		{
		final List<Ressources> lListeRessources = service.listRessources();
		pModel.addAttribute("listeRessources", lListeRessources);
		return "listeRessources";
	}
}
