package filrouge.jeu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import filrouge.jeu.bean.Joueur;
import filrouge.jeu.services.IServiceListeJoueurs;

@Controller
@RequestMapping(value="/afficherListeJoueurs")
public class AfficherListeJoueursController {
	
	@Autowired
	private IServiceListeJoueurs service;
	
	@RequestMapping(method=RequestMethod.GET)
	public String afficher(ModelMap pModel)		{
		final List<Joueur> lListeJoueurs=service.rechercherJoueurs();
		pModel.addAttribute("listeJoueurs", lListeJoueurs);
		return "listeJoueurs";
	}

}