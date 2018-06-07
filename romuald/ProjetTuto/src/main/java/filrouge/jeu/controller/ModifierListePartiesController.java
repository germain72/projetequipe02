package filrouge.jeu.controller;

import java.util.Date;
import java.util.LinkedList;
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
import filrouge.jeu.services.IServiceListeJoueurs;
import filrouge.jeu.services.IServiceListeParties;

@Controller
public class ModifierListePartiesController {
	
	@Autowired
	private IServiceListeParties service;
	
	@RequestMapping(value = "/afficherModificationListeParties", method = RequestMethod.GET)
	public String afficher(final ModelMap pModel) {
		if (pModel.get("modificationPartie") == null) {
			final List<Partie> lListeParties = service.rechercherParties();
			final ModificationFormPartie lModificationForm = new ModificationFormPartie();
			final List<ModificationPartie> lListe = new LinkedList<ModificationPartie>();
			for (final Partie lPartie : lListeParties) {
				final ModificationPartie lModificationPartie = new ModificationPartie();
				lModificationPartie.setIdpartie(lPartie.getIdPartie());
				lModificationPartie.setNom(lPartie.getNom());
				lModificationPartie.setDate(lPartie.getDate());
				lListe.add(lModificationPartie);
			}
			lModificationForm.setListeParties(lListe);
			pModel.addAttribute("modificationPartie", lModificationForm);
		}
		return "modificationPartie";
	}

	@RequestMapping(value = "/modifierModificationListeParties", method = RequestMethod.POST)
	public String modifier(
			@Valid @ModelAttribute(value = "modificationPartie") final ModificationFormPartie pModification,
			final BindingResult pBindingResult, final ModelMap pModel) {
		if (!pBindingResult.hasErrors()) {
			final List<Partie> lListeParties = new LinkedList<Partie>();
			for (final ModificationPartie lModificationPartie : pModification.getListeParties()) {
				final Partie lPartie = new Partie();
				lPartie.setIdPartie(lModificationPartie.getIdPartie());
				lPartie.setNom(lModificationPartie.getNom());
				lPartie.setDate(lModificationPartie.getDate());
				lListeParties.add(lPartie);
			}
			service.modifierParties(lListeParties);
		}
		return afficher(pModel);
	}
}