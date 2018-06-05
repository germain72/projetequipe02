package filrouge.jeu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import filrouge.jeu.bean.Partie;
import filrouge.jeu.services.IServiceListeParties;

@Controller
public class SupprimerListePartiesController {
	@Autowired
	private IServiceListeParties service;

	@RequestMapping(value = "/afficherSuppressionListeParties", method = RequestMethod.GET)
	public String afficher(final ModelMap pModel) {
		final List<Partie> lListeParties = service.rechercherParties();
		pModel.addAttribute("listeParties", lListeParties);
		return "suppressionPartie";
	}

	@RequestMapping(value = "/supprimerSuppressionListeParties", method = RequestMethod.GET)
	public String supprimer(@RequestParam(value = "idPartie") final Integer pIdPartie, final ModelMap pModel) {
		service.supprimerPartie(pIdPartie);
		
		return afficher(pModel);

	}
}