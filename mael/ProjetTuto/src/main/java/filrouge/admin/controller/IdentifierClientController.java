package filrouge.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import filrouge.admin.services.IListeClientsServices;

@Controller
@RequestMapping("/testlogin")

public class IdentifierClientController {
	@Autowired 
	private IListeClientsServices service;
	
	@RequestMapping(method = RequestMethod.GET)
	public String rechercherClient(final ModelMap pModel) {
		pModel.addAttribute("login", service.identifierClient("Amarilloz", "mdp", true));
		return "test";
	}
}
