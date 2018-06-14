package filrouge.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import filrouge.admin.bean.Client;
import filrouge.admin.services.IListeClientsServices;

@Controller
@RequestMapping(value = "/afficherListeClients")
public class AfficherListeClientsController {
	@Autowired
	private IListeClientsServices service;

	@RequestMapping(method = RequestMethod.GET)
	public String afficher(ModelMap pModel) {
		final List<Client> lListeClients = service.listeClients();
		pModel.addAttribute("listeClients", lListeClients);
		return "listeClients";
	}
}
