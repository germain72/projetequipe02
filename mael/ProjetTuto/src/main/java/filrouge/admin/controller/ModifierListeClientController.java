package filrouge.admin.controller;

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

import filrouge.admin.bean.Client;
import filrouge.admin.services.IListeClientsServices;

@Controller
public class ModifierListeClientController {
	@Autowired
	private IListeClientsServices service;

	@RequestMapping(value = "/afficherModificationListeClients", method = RequestMethod.GET)
	public String afficher(final ModelMap pModel) {
		if (pModel.get("modifierClient") == null) {
			final List<Client> lListeClients = service.listeClients();
			final ModifierClientForm lModifierClientForm = new ModifierClientForm();
			final List<ModifierClient> lListe = new LinkedList<ModifierClient>();
			for (final Client lClient : lListeClients) {
				final ModifierClient lModifierClient = new ModifierClient();
				lModifierClient.setIdclient(lClient.getIdclient());
				lModifierClient.setNomclient(lClient.getNomclient());
				lModifierClient.setPrenomclient(lClient.getPrenomclient());
				lModifierClient.setNaissanceclient(lClient.getNaissanceclient());
				lModifierClient.setPseudoclient(lClient.getPseudoclient());
				lModifierClient.setMdpclient(lClient.getMdpclient());
				lModifierClient.setAdmin(lClient.isAdmin());
				lListe.add(lModifierClient);
			}
			lModifierClientForm.setListeClients(lListe);
			pModel.addAttribute("modifierClient", lModifierClientForm);
		}
		return "modifierClient";
	}

	@RequestMapping(value = "/modifierModificationListeClients", method = RequestMethod.POST)
	public String modifier(@Valid @ModelAttribute(value = "modifierClient") final ModifierClientForm pModifier,
			final BindingResult pBindingResult, final ModelMap pModel) {
		if (!pBindingResult.hasErrors()) {
			final List<Client> lListeClients = new LinkedList<Client>();
			for (final ModifierClient lModifierClient : pModifier.getListeClients()) {
				final Client lClient = new Client();
				lClient.setIdclient(lModifierClient.getIdclient());
				final String lNom = lModifierClient.getNomclient();
				lClient.setNomclient(lNom);
				final String lPrenom = lModifierClient.getPrenomclient();
				lClient.setPrenomclient(lPrenom);

				final Date lNaissance = lModifierClient.getNaissanceclient();
				lClient.setNaissanceclient(lNaissance);
				
				final String lPseudo = lModifierClient.getPseudoclient();
				lClient.setPseudoclient(lPseudo);
				final String lMdp = lModifierClient.getMdpclient();
				lClient.setMdpclient(lMdp);
				final boolean lAdmin = lModifierClient.isAdmin();
				lClient.setAdmin(lAdmin);
				lListeClients.add(lClient);
			}
			service.modifierClient(lListeClients);
		}
		return afficher(pModel);
	}
}
