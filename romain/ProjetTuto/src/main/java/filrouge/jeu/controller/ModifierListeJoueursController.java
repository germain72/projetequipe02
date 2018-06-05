package filrouge.jeu.controller;

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

import filrouge.jeu.bean.Joueur;
import filrouge.jeu.services.IServiceListeJoueurs;

@Controller
public class ModifierListeJoueursController {
	@Autowired
	private IServiceListeJoueurs service;

	@RequestMapping(value = "/afficherModificationListeJoueurs", method = RequestMethod.GET)
	public String afficher(final ModelMap pModel) {
		if (pModel.get("modificationJoueur") == null) {
			final List<Joueur> lListeJoueurs = service.rechercherJoueurs();
			final ModificationFormJoueur lModificationForm = new ModificationFormJoueur();
			final List<ModificationJoueur> lListe = new LinkedList<ModificationJoueur>();
			for (final Joueur lJoueur : lListeJoueurs) {
				final ModificationJoueur lModificationJoueur = new ModificationJoueur();
				lModificationJoueur.setIdjoueur(lJoueur.getIdJoueur());
				lModificationJoueur.setNom(lJoueur.getNom());
				lListe.add(lModificationJoueur);
			}
			lModificationForm.setListeJoueurs(lListe);
			pModel.addAttribute("modificationJoueur", lModificationForm);
		}
		return "modificationJoueur";
	}

	@RequestMapping(value = "/modifierModificationListeJoueurs", method = RequestMethod.POST)
	public String modifier(@Valid @ModelAttribute(value = "modificationJoueur") final ModificationFormJoueur pModification,
			final BindingResult pBindingResult, final ModelMap pModel) {
		if (!pBindingResult.hasErrors()) {
			final List<Joueur> lListeJoueurs = new LinkedList<Joueur>();
			for (final ModificationJoueur lModificationJoueur : pModification.getListeJoueurs()) {
				final Joueur lJoueur = new Joueur();
				lJoueur.setIdJoueur(lModificationJoueur.getIdjoueur());
				final String lNom = String.valueOf(lModificationJoueur.getNom());
				lJoueur.setNom(lNom);
				lListeJoueurs.add(lJoueur);
			}
			service.modifierJoueurs(lListeJoueurs);
		}
		return afficher(pModel);
	}
}