package filrouge.jeu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	public void creerRessources(final Ressources pRessources) {
		// TODO Auto-generated method stub
		dao.creerRessources(pRessources);

	}

	@Transactional()
	public void creerRessources(final String libebelle, final int typeRessource) {
		// TODO Auto-generated method stub
		Ressources nRessources = new Ressources(libebelle, typeRessource);
		dao.creerRessources(nRessources);
		
	}

	@Transactional()
	public void supprimerRessources(final Ressources pRessources) {
		// TODO Auto-generated method stub
		dao.supprimerRessources(pRessources);

	}

	@Transactional()
	public void modifierRessources(final Ressources pRessource) {
		// TODO Auto-generated method stub
		dao.supprimerRessources(pRessource);
	}

	@Transactional()
	public void modifierRessources(final List<Ressources> pRessources) {
		// TODO Auto-generated method stub
		for (Ressources ressources : pRessources) {
			dao.modifierRessources(ressources);
		}
		
	}

	@Transactional()
	public Ressources getRessourcesById(int id) {
		// TODO Auto-generated method stub
		
		return dao.getRessourcesById(id);
	}

	@Transactional()
	public void modifierRessource(Ressources pRessources) {
		// TODO Auto-generated method stub
		dao.modifierRessources(pRessources);
	}

}
