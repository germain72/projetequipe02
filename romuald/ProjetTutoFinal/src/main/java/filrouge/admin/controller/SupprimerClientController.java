package filrouge.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import filrouge.admin.bean.Client;
import filrouge.admin.services.IListeClientsServices;

@Controller
public class SupprimerClientController {
	@Autowired
	private IListeClientsServices service;
	
	@RequestMapping(value="/afficherSuppressionListeClients", method = RequestMethod.GET)
	public String afficher(final ModelMap pModel) {
		final List<Client> lListeClients = service.listeClients();
		pModel.addAttribute("listeClients", lListeClients);
		return "supprimerClient";
	}
	
	@RequestMapping(value="/supprimerSuppressionListeClients", method = RequestMethod.GET)
	public String supprimer(@RequestParam(value="idClient") final Integer idClient,
				final ModelMap pModel) {
		service.supprimerClient(idClient);
		return afficher(pModel);
	}
}
