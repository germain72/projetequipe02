package filrouge.admin.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;

import org.springframework.stereotype.Repository;

import filrouge.admin.bean.Client;

@Repository
public class ListeClientsDAO implements IListeClientsDAO {
	@PersistenceContext
	private EntityManager entityManager;

	public List<Client> listeClients() {
		// TODO Auto-generated method stub
		final CriteriaBuilder lCriteriaBuilder = entityManager.getCriteriaBuilder();
		final CriteriaQuery<Client> lCriteriaQuery = lCriteriaBuilder.createQuery(Client.class);
		final Root<Client> lRoot = lCriteriaQuery.from(Client.class);
		lCriteriaQuery.select(lRoot);
		final TypedQuery<Client> lTypedQuery = entityManager.createQuery(lCriteriaQuery);
		return lTypedQuery.getResultList();
	}

	// Test avec IdentifierClientController et test.jsp
	public boolean identifierClient(String pseudo, String mdp, boolean admin) {
		// TODO Auto-generated method stub
		final CriteriaBuilder lCriteriaBuilder = entityManager.getCriteriaBuilder();
		//
		final CriteriaQuery<Long> lCriteriaQuery = lCriteriaBuilder.createQuery(Long.class);

		final Root<Client> lRoot = lCriteriaQuery.from(Client.class);
		lCriteriaQuery.select(lCriteriaBuilder.count(lRoot));
		lCriteriaQuery.where(
				lCriteriaBuilder.equal(lRoot.get("pseudoclient"), lCriteriaBuilder.parameter(String.class, "pseudo")),
				lCriteriaBuilder.equal(lRoot.get("mdpclient"), lCriteriaBuilder.parameter(String.class, "mdp")),
				lCriteriaBuilder.equal(lRoot.get("admin"), lCriteriaBuilder.parameter(Boolean.class, "admin")));
		//
		final TypedQuery<Long> lTypedQuery = entityManager.createQuery(lCriteriaQuery);
		lTypedQuery.setParameter("pseudo", pseudo);
		lTypedQuery.setParameter("mdp", mdp);
		lTypedQuery.setParameter("admin", admin);

		final int lRowCount = lTypedQuery.getResultList().size();
		//
		if (lRowCount > 0) {
			if (lTypedQuery.getResultList().get(0) == 0)
				return false;
			return true;
		}
		return false;
	}

	public boolean identifierNouveauClient(String pseudo, boolean admin) {
		// TODO Auto-generated method stub
		final CriteriaBuilder lCriteriaBuilder = entityManager.getCriteriaBuilder();
		//
		final CriteriaQuery<Long> lCriteriaQuery = lCriteriaBuilder.createQuery(Long.class);

		final Root<Client> lRoot = lCriteriaQuery.from(Client.class);
		lCriteriaQuery.select(lCriteriaBuilder.count(lRoot));
		lCriteriaQuery.where(
				lCriteriaBuilder.equal(lRoot.get("pseudoclient"), lCriteriaBuilder.parameter(String.class, "pseudo")),
				lCriteriaBuilder.equal(lRoot.get("admin"), lCriteriaBuilder.parameter(Boolean.class, "admin")));
		//
		final TypedQuery<Long> lTypedQuery = entityManager.createQuery(lCriteriaQuery);
		lTypedQuery.setParameter("pseudo", pseudo);
		lTypedQuery.setParameter("admin", admin);

		final int lRowCount = lTypedQuery.getResultList().size();
		//
		if (lRowCount > 0) {
			if (lTypedQuery.getResultList().get(0) == 0)
				return false;
			return true;
		}
		return false;
	}

	public void creerClient(Client client) {
		// TODO Auto-generated method stub
		boolean identifierClient = identifierNouveauClient(client.getPseudoclient(), client.isAdmin());
		if (identifierClient == false) {
			entityManager.persist(client);
		}
	}

	public void modifierClient(final Client client) {
		// TODO Auto-generated method stub
		final CriteriaBuilder lCriteriaBuilder = entityManager.getCriteriaBuilder();
		final CriteriaUpdate<Client> lCriteriaUpdate = lCriteriaBuilder.createCriteriaUpdate(Client.class);
		final Root<Client> lRoot = lCriteriaUpdate.from(Client.class);
		final Path<Client> lPath = lRoot.get("idclient");
		final Expression<Boolean> lExpression = lCriteriaBuilder.equal(lPath, client.getIdclient());
		lCriteriaUpdate.where(lExpression);
		lCriteriaUpdate.set("nomclient", client.getNomclient());
		lCriteriaUpdate.set("prenomclient", client.getPrenomclient());
		lCriteriaUpdate.set("naissanceclient", client.getNaissanceclient());
		lCriteriaUpdate.set("pseudoclient", client.getPseudoclient());
		lCriteriaUpdate.set("mdpclient", client.getMdpclient());
		lCriteriaUpdate.set("admin", client.isAdmin());
		final Query lQuery = entityManager.createQuery(lCriteriaUpdate);
		final int lRowCount = lQuery.executeUpdate();
		if (lRowCount != 1) {
			final org.hibernate.Query lHQuery = lQuery.unwrap(org.hibernate.Query.class);
			final String lSql = lHQuery.getQueryString();
			throw new RuntimeException("Nombre d'occurences (" + lRowCount + ") modifiés différent de 1 pour " + lSql);
		}
	}

	public void supprimerClient(final Client client) {
		// TODO Auto-generated method stub
		final Client fclient = entityManager.getReference(Client.class, client.getIdclient());
		entityManager.remove(fclient);

	}

}
