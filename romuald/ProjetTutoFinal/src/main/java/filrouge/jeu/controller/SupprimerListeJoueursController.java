package filrouge.jeu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import filrouge.jeu.bean.Joueur;
import filrouge.jeu.services.IServiceListeJoueurs;

@Controller
public class SupprimerListeJoueursController {
	@Autowired
	private IServiceListeJoueurs service;

	@RequestMapping(value = "/afficherSuppressionListeJoueurs", method = RequestMethod.GET)
	public String afficher(final ModelMap pModel) {
		final List<Joueur> lListeJoueurs = service.rechercherJoueurs();
		pModel.addAttribute("listeJoueurs", lListeJoueurs);
		return "suppressionJoueur";
	}

	@RequestMapping(value = "/supprimerSuppressionListeJoueurs", method = RequestMethod.GET)
	public String supprimer(@RequestParam(value = "idJoueur") final Integer pIdJoueur, final ModelMap pModel) {
		service.supprimerJoueur(pIdJoueur);
		
		return afficher(pModel);

	}
}