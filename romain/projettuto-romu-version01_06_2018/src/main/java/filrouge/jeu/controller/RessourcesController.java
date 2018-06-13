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
import org.springframework.web.bind.annotation.RequestParam;

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

	// CreeRessources Debut
	
	
	@RequestMapping(value = "/creeRessources", method = RequestMethod.GET)
	public String cree(ModelMap pModel) {
		// final List<Ressources> lListeRessources = service.listRessources();
		// pModel.addAttribute("listeRessources", lListeRessources);
		// CreeRessourcesForm est la class de verification de formulaire elle doit étre apeler dans le formulaire en ten que form atribut
		if (pModel.get("creation") == null) {
			pModel.addAttribute("creation", new CreeRessourcesForm());
		}
		return "creeRessources";
	}

	@RequestMapping(value = "/creeActionRessources", method = RequestMethod.POST)
	public String creer(@Valid @ModelAttribute(value = "creation") final CreeRessourcesForm pCreation,
			final BindingResult pBindingResult, final ModelMap pModel) {
		if (!pBindingResult.hasErrors()) {
			//final Integer lIntQuantite = Integer.valueOf(pCreation.getQuantite());
			service.creerRessources(pCreation.getLibelle(), 0);
			final List<Ressources> lListeRessources = service.listRessources();
			pModel.addAttribute("listeRessources", lListeRessources);
			return "creeRessourcesResult";
		}
		return cree(pModel);
	}

	// CreeRessources Fin
	
	// Supprimer ressource
		@RequestMapping(value = "/supprimerRessource", method = RequestMethod.GET)
		public String supprimer(ModelMap pModel) {
			final List<Ressources> lListeRessources = service.listRessources();
			pModel.addAttribute("listeRessources", lListeRessources);
			return "supprimerRessources";
		}

		@RequestMapping(value = "/supprimerActionRessource", method = RequestMethod.GET)
		public String supprimer(@RequestParam(value="idRessource") final Integer pIdRessource ,ModelMap pModel )
		{
			final List<Ressources> lListeRessources = service.listRessources();
			pModel.addAttribute("listeRessources", lListeRessources);
			//final Ressources lRessources = lListeRessources.get(pIdRessource);
			Ressources ressources = service.getRessourcesById(pIdRessource);
			
			pModel.addAttribute("ressourcessup", ressources);
			service.supprimerRessources(ressources);
			return "supprimerRessourcesResult";
		}
}
