package tn.espritSpring.Services;

import java.util.List;

import tn.espritSpring.DAO.entites.DetailFacture;
import tn.espritSpring.DAO.entites.Produit;



public interface IDetailFactureService  {
	
	 List<DetailFacture> retrieveAllDetailFacture();
	 DetailFacture addDetailFacture(DetailFacture d);
	 void deleteDetailFacture(Long id);
	 DetailFacture updateDetailFacture(DetailFacture d);
	 DetailFacture retrieveDetailFacture(Long id);

}
