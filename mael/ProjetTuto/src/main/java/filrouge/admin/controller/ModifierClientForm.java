package filrouge.admin.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;

@Controller
public class ModifierClientForm {
	@Valid
	private List<ModifierClient> listeClients;

	public void setListeClients(final List<ModifierClient> pListeClient) {
		listeClients = pListeClient;
	}

	public List<ModifierClient> getListeClients() {
		return listeClients;
	}
}
