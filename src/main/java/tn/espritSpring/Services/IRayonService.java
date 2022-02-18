package tn.espritSpring.Services;

import java.util.List;


import tn.espritSpring.DAO.entites.Rayon;

public interface IRayonService {
	
	 List<Rayon> retrieveAllRayon();
	 Rayon addRayon(Rayon r);
	 void deleteRayon(Long id);
	 Rayon updateRayon(Rayon r);
	 Rayon retrieveRayon(Long id);
}
