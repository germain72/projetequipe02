package filrouge.admin.services;

import java.util.Date;
import java.util.List;

import filrouge.admin.bean.Client;

public interface IListeClientsServices {
	List<Client> listeClients();

	boolean identifierClient(String pseudo, String mdp, boolean admin);

	void creerClient(final String nom, final String prenom, final Date naissance, final String pseudo, final String mdp,
			final boolean admin);

	void modifierClient();

	void supprimerClient();
}
