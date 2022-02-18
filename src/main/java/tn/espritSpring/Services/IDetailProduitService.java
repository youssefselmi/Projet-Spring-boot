package tn.espritSpring.Services;

import java.util.List;

import tn.espritSpring.DAO.entites.DetailProduit;;


public interface IDetailProduitService {


	 List<DetailProduit> retrieveAllDetailProduit();
	 DetailProduit addDetailProduit(DetailProduit p);
	 void deleteDetailProduit(Long id);
	 DetailProduit updateDetailProduit(DetailProduit p);
	 DetailProduit retrieveDetailProduit(Long id);
	
	
	
	
}
