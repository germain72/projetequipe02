package filrouge.jeu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import filrouge.jeu.DAO.IListePartiesDAO;
import filrouge.jeu.DAO.IListeRessourcesDAO;
import filrouge.jeu.bean.Ressources;

@Service
public class ServiceListeRessources implements IServiceListeRessources {

	@Autowired
	private IListeRessourcesDAO dao;

	
	@Transactional(readOnly=true)
	public List<Ressources> listRessources() {
		// TODO Auto-generated method stub
		return dao.listRessources();
	}

//	public Ressources getRessourcesById(int id) {
//		// TODO Auto-generated method stub
//		return dao.listRessources().ind;
//	}
//
//	public Ressources getRessourcesByEnumType(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Transactional()
	public void creerRessources(Ressources pRessources) {
		// TODO Auto-generated method stub
		dao.creerRessources(pRessources);

	}

	public void creerRessources(String libebelle, int typeRessource) {
		// TODO Auto-generated method stub
		Ressources nRessources = new Ressources(libebelle, typeRessource);

	}

	public void supprimerRessources(Ressources pRessources) {
		// TODO Auto-generated method stub

	}

	public void modifierRessources(Ressources pRessources) {
		// TODO Auto-generated method stub

	}

}
