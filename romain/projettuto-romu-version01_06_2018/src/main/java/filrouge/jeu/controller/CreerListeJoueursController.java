package filrouge.jeu.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import filrouge.jeu.bean.Joueur;
import filrouge.jeu.services.IServiceListeJoueurs;


@Controller
public class CreerListeJoueursController {

	@Autowired
	private IServiceListeJoueurs service;

	@RequestMapping(value = "/afficherCreationListeJoueurs", method = RequestMethod.GET)
	public String afficher(final ModelMap pModel) {
		final List<Joueur> IListeJoueurs = service.rechercherJoueurs();
		pModel.addAttribute("listeJoueurs", IListeJoueurs);
		if (pModel.get("creationJoueur") == null) {
			pModel.addAttribute("creationJoueur", new CreationFormJoueur());
		}
		return "creationJoueur";
	}
	@RequestMapping(value="/creerCreationListeJoueurs", method = RequestMethod.POST)
	public String creer(@Valid @ModelAttribute(value="creationJoueur") final CreationFormJoueur pCreation,
			final BindingResult pBindingResult, final ModelMap pModel) {
		
		if (!pBindingResult.hasErrors()) {
			service.creerJoueur(pCreation.getNom());
			}
		return afficher(pModel);
		}
}