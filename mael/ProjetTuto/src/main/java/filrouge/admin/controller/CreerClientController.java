package filrouge.admin.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import filrouge.admin.bean.Client;
import filrouge.admin.services.IListeClientsServices;

@Controller
public class CreerClientController {
	@Autowired
	private IListeClientsServices service;

	@RequestMapping(value = "/afficherCreationListeClients", method = RequestMethod.GET)
	public String afficher(final ModelMap pModel) {
		final List<Client> lListeClients = service.listeClients();
		pModel.addAttribute("listeClients", lListeClients);
		if (pModel.get("creerClient") == null) {
			CreerClientForm CF = new CreerClientForm();
			pModel.addAttribute("creerClient", new CreerClientForm());
		}
		return "creerClient";
	}

	@RequestMapping(value = "/creerCreationListeClients", method = RequestMethod.POST)
	public String creer(@Valid @ModelAttribute(value = "creerClient") final CreerClientForm pCreation,
			final BindingResult pBindingResult, final ModelMap pModel) {
		if (!pBindingResult.hasErrors()) {
			service.creerClient(pCreation.getNom(), pCreation.getPrenom(), DateTime.getDateFormat(pCreation.getNaissance(),""),
					pCreation.getPseudo(), pCreation.getMdp(), pCreation.isAdmin());
		}
		return afficher(pModel);
	}
}