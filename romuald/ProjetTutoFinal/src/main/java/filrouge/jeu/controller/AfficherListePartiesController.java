package filrouge.jeu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import filrouge.jeu.bean.Partie;
import filrouge.jeu.services.IServiceListeParties;

@Controller
@RequestMapping(value="/afficherListeParties")
public class AfficherListePartiesController {
	
	@Autowired
	private IServiceListeParties service;
	
	@RequestMapping(method=RequestMethod.GET)
	public String afficher(ModelMap pModel)		{
		final List<Partie> lListeParties=service.rechercherParties();
		pModel.addAttribute("listeParties", lListeParties);
		return "listeParties";
	}

}