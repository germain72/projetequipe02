package filrouge.admin.dao;

import java.util.List;

import filrouge.admin.bean.Client;


public interface IListeClientsDAO {
	List<Client> listeClients();
	boolean identifierClient(String pseudo, String mdp, boolean admin);
	void creerClient(Client client);
	void modifierClient(final Client client);
	void supprimerClient(final Client client);
}
