package filrouge.admin.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;

@Controller
public class ModifierClient {
	@Valid
	private List<ModifierClientForm> listeClients;

	public void setListeClients(final List<ModifierClientForm> pListeClient) {
		listeClients = pListeClient;
	}

	public List<ModifierClientForm> getListeClients() {
		return listeClients;
	}
}
