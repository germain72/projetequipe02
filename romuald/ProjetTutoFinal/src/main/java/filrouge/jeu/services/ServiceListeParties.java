package filrouge.jeu.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import filrouge.jeu.DAO.IListePartiesDAO;
import filrouge.jeu.bean.Partie;

@Service
public class ServiceListeParties implements IServiceListeParties {

	@Autowired
	private IListePartiesDAO dao;
	
	@Transactional(readOnly=true)
	public List<Partie> rechercherParties() {
		return dao.rechercherParties();
	}
	
	@Transactional
	public void creerPartie(String pNom, Date pDate) {
		final Partie lPartie = new Partie();
		lPartie.setNom(pNom);
		lPartie.setDate(pDate);

		dao.creerPartie(lPartie);
	}

	@Transactional
	public void supprimerPartie(Integer pIdPartie) {
		final Partie lPartie = new Partie();
		lPartie.setIdPartie(pIdPartie);
		
		dao.supprimerPartie(lPartie);
	}

	@Transactional
	public void modifierParties(List<Partie> pListeParties) {
		for (final Partie lPartie : pListeParties) {
			
			dao.modifierParties(lPartie);
		
	}
}
}
