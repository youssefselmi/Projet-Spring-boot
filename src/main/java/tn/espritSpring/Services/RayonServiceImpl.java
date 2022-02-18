package tn.espritSpring.Services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tn.espritSpring.DAO.entites.Rayon;
import tn.espritSpring.DAO.repository.ProduitRepository;
import tn.espritSpring.DAO.repository.RayonRepository;


@Service
public class RayonServiceImpl implements IRayonService  {
	
@Autowired
RayonRepository rayonrepo;

	@Override
	public List<Rayon> retrieveAllRayon() {
		List<Rayon> rayons =(List<Rayon> )rayonrepo.findAll();

		for (Rayon r: rayons){
			
			System.out.println("test");
		}
		return rayons;
	}

	@Override
	public Rayon addRayon(Rayon r) {
		return rayonrepo.save(r);
	}

	@Override
	public void deleteRayon(Long id) {
		rayonrepo.deleteById(id);		
	}

	@Override
	// @PersistenceContext
	public Rayon updateRayon(Rayon r) {
		
	    //EntityManager entityManager = null;

	   // entityManager.flush();
		rayonrepo.save(r);
		
		
		
		//rayonrepo.deleteById(r.getIdRayon()-1);		

		
		
		
		return r;
		
		
		
		
	}

	@Override
	public Rayon retrieveRayon(Long id) {
		return rayonrepo.findById(id).get();
	}

}
