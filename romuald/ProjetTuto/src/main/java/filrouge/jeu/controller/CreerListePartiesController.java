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

import filrouge.jeu.bean.Partie;
import filrouge.jeu.services.IServiceListeParties;

@Controller
public class CreerListePartiesController {
	@Autowired
	private IServiceListeParties service;

	@RequestMapping(value = "/afficherCreationListeParties", method = RequestMethod.GET)
	public String afficher(final ModelMap pModel) {
		final List<Partie> IListeParties = service.rechercherParties();
		pModel.addAttribute("listeParties", IListeParties);
		if (pModel.get("creationPartie") == null) {
			pModel.addAttribute("creationPartie", new CreationFormPartie());
		}
		return "creationPartie";
	}
	@RequestMapping(value="/creerCreationListeParties", method = RequestMethod.POST)
	public String creer(@Valid @ModelAttribute(value="creationPartie") final CreationFormPartie pCreation,
			final BindingResult pBindingResult, final ModelMap pModel) {
		
		if (!pBindingResult.hasErrors()) {
			service.creerPartie(pCreation.getNom(), pCreation.getDate());
			}
		return afficher(pModel);
		}
}

