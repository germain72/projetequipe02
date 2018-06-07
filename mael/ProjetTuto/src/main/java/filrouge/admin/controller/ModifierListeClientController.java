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
			final ModifierClient lModifierClient = new ModifierClient();
			final List<ModifierClientForm> lListe = new LinkedList<ModifierClientForm>();
			for (final Client lClient : lListeClients) {
				final ModifierClientForm lModifierClientForm = new ModifierClientForm();
				lModifierClientForm.setIdclient(lClient.getIdclient());
				lModifierClientForm.setNomclient(lClient.getNomclient());
				lModifierClientForm.setPrenomclient(lClient.getPrenomclient());
				lModifierClientForm.setNaissanceclient(lClient.getNaissanceclient());
				lModifierClientForm.setPseudoclient(lClient.getPseudoclient());
				lModifierClientForm.setMdpclient(lClient.getMdpclient());
				lModifierClientForm.setAdmin(lClient.isAdmin());
				lListe.add(lModifierClientForm);
			}
			lModifierClient.setListeClients(lListe);
			pModel.addAttribute("modifierClient", lModifierClient);
		}
		return "modifierClient";
	}

	@RequestMapping(value = "/modifierModificationListeClients", method = RequestMethod.POST)
	public String modifier(@Valid @ModelAttribute(value = "modifierClient") final ModifierClient pModifier,
			final BindingResult pBindingResult, final ModelMap pModel) {
		if (!pBindingResult.hasErrors()) {
			final List<Client> lListeClients = new LinkedList<Client>();
			for (final ModifierClientForm lModifierClientForm : pModifier.getListeClients()) {
				final Client lClient = new Client();
				lClient.setIdclient(lModifierClientForm.getIdclient());
				final String lNom = lModifierClientForm.getNomclient();
				lClient.setNomclient(lNom);
				final String lPrenom = lModifierClientForm.getPrenomclient();
				lClient.setPrenomclient(lPrenom);

				final Date lNaissance = lModifierClientForm.getNaissanceclient();
				lClient.setNaissanceclient(lNaissance);
				
				final String lPseudo = lModifierClientForm.getPseudoclient();
				lClient.setPseudoclient(lPseudo);
				final String lMdp = lModifierClientForm.getMdpclient();
				lClient.setMdpclient(lMdp);
				final boolean lAdmin = lModifierClientForm.isAdmin();
				lClient.setAdmin(lAdmin);
				lListeClients.add(lClient);
			}
			service.modifierClient(lListeClients);
		}
		return afficher(pModel);
	}
}
