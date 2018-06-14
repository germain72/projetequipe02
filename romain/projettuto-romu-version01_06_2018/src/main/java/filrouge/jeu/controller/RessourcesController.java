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

	// CRUD R
	// AfficherListe
	@RequestMapping(value = "/afficherListeRessources", method = RequestMethod.GET)
	public String afficher(ModelMap pModel) {
		final List<Ressources> lListeRessources = service.listRessources();
		pModel.addAttribute("listeRessources", lListeRessources);
		return "listeRessources";
	}

	// CRUD C
	// CreeRessources Debut

	@RequestMapping(value = "/creeRessources", method = RequestMethod.GET)
	public String cree(ModelMap pModel) {
		// final List<Ressources> lListeRessources = service.listRessources();
		// pModel.addAttribute("listeRessources", lListeRessources);
		// CreeRessourcesForm est la class de verification de formulaire elle doit étre
		// apeler dans le formulaire en ten que form atribut
		if (pModel.get("creation") == null) {
			pModel.addAttribute("creation", new CreeRessourcesForm());
		}
		return "creeRessources";
	}

	@RequestMapping(value = "/creeActionRessources", method = RequestMethod.POST)
	public String creer(@Valid @ModelAttribute(value = "creation") final CreeRessourcesForm pCreation,
			final BindingResult pBindingResult, final ModelMap pModel) {
		if (!pBindingResult.hasErrors()) {
			// final Integer lIntQuantite = Integer.valueOf(pCreation.getQuantite());
			service.creerRessources(pCreation.getLibelle(), 0);
			final List<Ressources> lListeRessources = service.listRessources();
			pModel.addAttribute("listeRessources", lListeRessources);
			return "creeRessourcesResult";
		}
		return cree(pModel);
	}

	// CreeRessources Fin

	// CRUD D
	// Supprimer ressource
	@RequestMapping(value = "/afficherSupprimerRessource", method = RequestMethod.GET)
	public String supprimer(ModelMap pModel) {
		final List<Ressources> lListeRessources = service.listRessources();
		pModel.addAttribute("listeRessources", lListeRessources);
		return "listeSupprimerRessources";
	}

	@RequestMapping(value = "/supprimerActionRessource", method = RequestMethod.GET)
	public String supprimer(@RequestParam(value = "idRessource") final Integer pIdRessource, ModelMap pModel) {
		// final Ressources lRessources = lListeRessources.get(pIdRessource);
		// System.out.println("0000");
		// System.out.println(pIdRessource);
		// Ressources ressources = service.getRessourcesById(pIdRessource);
		// System.out.println(ressources.getId());
		// System.out.println(ressources.getLibebelle());
		// System.out.println(ressources.getTypeRessource());
		// System.out.println("00000000000");
		// Ressources rescopie = new Ressources();
		// System.out.println(ressources);
		// rescopie.setId(ressources.getId());
		// rescopie.setLibebelle(ressources.getLibebelle());
		// rescopie.setTypeRessource(ressources.getTypeRessource());
		// System.out.println("0");
		// pModel.addAttribute("ressourcessup", rescopie);
		// service.supprimerRessources(ressources);
		// System.out.println("1");
		// final List<Ressources> lListeRessources = service.listRessources();
		// System.out.println("2");
		// pModel.addAttribute("listeRessources", lListeRessources);
		// System.out.println("3");

		Ressources sRessource = service.getRessourcesById(pIdRessource);

		pModel.addAttribute("supRessources", sRessource);
		// Ressources nRessources = new Ressources(ressource.getLibebelle() + "",
		// ressource.getTypeRessource() + 0);
		// nRessources.setId(ressource.getId() + 0);

		service.supprimerRessources(sRessource);

		final List<Ressources> lListeRessources = service.listRessources();
		pModel.addAttribute("listeRessources", lListeRessources);

		return "supprimerRessourcesResult";
	}

	// CRUD U
	// Modification debut
	@RequestMapping(value = "/afficherModifierRessource", method = RequestMethod.GET)
	public String listModifier(ModelMap pModel) {
		final List<Ressources> lListeRessources = service.listRessources();
		pModel.addAttribute("listeRessources", lListeRessources);
		return "listeModificationRessources";
	}

	@RequestMapping(value = "/modifierRessource", method = RequestMethod.GET)
	public String listModifier(@RequestParam(value = "idRessource") final Integer pIdRessource, ModelMap pModel) {
		final Ressources mRessources = service.getRessourcesById(pIdRessource);
		pModel.addAttribute("Ressource", mRessources);
		if (pModel.get("modifier") == null) {
			ModifierRessourcesForm modifierRessourcesForm = new ModifierRessourcesForm();
			modifierRessourcesForm.setId(mRessources.getId());
			modifierRessourcesForm.setLibelle(mRessources.getLibebelle());
			modifierRessourcesForm.setTypeRessource(mRessources.getTypeRessource()); // valeurs par default
			pModel.addAttribute("modifier", modifierRessourcesForm);
		}

		return "modificationRessources";
	}

	@RequestMapping(value = "/modifierActionRessource", method = RequestMethod.POST)
	public String listModifier(
			@Valid @ModelAttribute(value = "modifier") final ModifierRessourcesForm pModRessourcesForm,
//			@RequestParam(value = "idRessource") final Integer pIdRessource,
//			@RequestParam(value = "lblRessource") final String pLblRessource,
//			@RequestParam(value = "idTypeRessource") final Integer pTypeRessource, 
			final BindingResult pBindingResult,
			ModelMap pModel) {

		if (!pBindingResult.hasErrors()) {
			
			
//			Ressources mRessources = new Ressources(pLblRessource, pTypeRessource);
//			mRessources.setId(pIdRessource);
			Ressources mRessources = new Ressources(pModRessourcesForm.getLibelle(), pModRessourcesForm.getTypeRessource());
			mRessources.setId(pModRessourcesForm.getId());
			
			
			pModel.addAttribute("RessourceModifier", service.getRessourcesById(pModRessourcesForm.getId()));
			pModel.addAttribute("RessourceModifierResult", mRessources);

			service.modifierRessource(mRessources);

			final List<Ressources> lListeRessources = service.listRessources();
			pModel.addAttribute("listeRessources", lListeRessources);

			return "modificationRessourcesResult";

		}
		return listModifier(pModRessourcesForm.getId(), pModel);
	}
	// Modification Fin
}
