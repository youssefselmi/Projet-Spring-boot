package tn.espritSpring.Services;

import java.util.List;

import tn.espritSpring.DAO.entites.Facture;


public interface IFactureService {

	
	 List<Facture> retrieveAllFacture();
	 Facture addFacture(Facture f);
	 void deleteFacture(Long id);
	 void cancelFacture(Long id);
	 Facture updateFacture(Facture f);
	 Facture retrieveFacture(Long id);
    void revenuEvryMonth();


	
	
	
	
	
	
	
	
}
