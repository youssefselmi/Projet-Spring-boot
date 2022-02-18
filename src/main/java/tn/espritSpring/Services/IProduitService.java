package tn.espritSpring.Services;

import java.util.Date;
import java.util.List;

import tn.espritSpring.DAO.entites.Produit;


public interface IProduitService  {
	
	List<Produit> retrieveAllProduits();
	Produit addProduit(Produit p, Long idRayon, Long idStock);
	Produit addProduitSimple(Produit p);
	Produit retrieveProduit(Long id);
	void assignProduitToStock(Long idProduit, Long idStock);
    void assignFournisseurToProduit(Long fournisseurId, Long produitId) ;
    float getRevenuBrutProduit(Long idProduit, Date startDate, Date endDate);



}
