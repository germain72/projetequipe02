package filrouge.admin.services;

import java.util.Date;
import java.util.List;

import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import filrouge.admin.bean.Client;
import filrouge.admin.dao.IListeClientsDAO;

@Service
public class ListeClientsServices implements IListeClientsServices {
	@Autowired
	private IListeClientsDAO dao;

	@Transactional(readOnly = true)
	public List<Client> listeClients() {
		// TODO Auto-generated method stub
		return dao.listeClients();
	}

	@Transactional
	public boolean identifierClient(String pseudo, String mdp, boolean admin) {
		// TODO Auto-generated method stub
		return dao.identifierClient(pseudo, mdp, admin);
	}

	@Transactional
	public boolean identifierNouveauClient(String pseudo, boolean admin) {
		// TODO Auto-generated method stub
		return dao.identifierNouveauClient(pseudo, admin);
	}

	@Transactional
	public void creerClient(final String nom, final String prenom, final Date naissance, final String pseudo,
			final String mdp, final boolean admin) {
		// TODO Auto-generated method stub
		if (pseudo.length() > 50) {
			return;
		}
		if (mdp.length() > 8) {
			return;
		}
		final Client lClient = new Client();
		lClient.setNomclient(nom);
		lClient.setPrenomclient(prenom);
		lClient.setNaissanceclient(naissance);
		lClient.setPseudoclient(pseudo);
		lClient.setMdpclient(mdp);
		lClient.setAdmin(admin);
		dao.creerClient(lClient);
	}

	@Transactional
	public void modifierClient(final List<Client> listeClients) {
		// TODO Auto-generated method stub
		for(final Client lClient : listeClients ) {
			dao.modifierClient(lClient);
		}
	}

	@Transactional
	public void supprimerClient(final Integer idClient) {
		// TODO Auto-generated method stub
		final Client lClient = new Client();
		lClient.setIdclient(idClient);
		dao.supprimerClient(lClient);
	}

}
