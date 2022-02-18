package tn.espritSpring.Services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tn.espritSpring.DAO.entites.Fournisseur;
import tn.espritSpring.DAO.entites.Produit;
import tn.espritSpring.DAO.entites.Rayon;
import tn.espritSpring.DAO.entites.Stock;
import tn.espritSpring.DAO.repository.DetailFactureRepository;
import tn.espritSpring.DAO.repository.FournisseurRepository;
import tn.espritSpring.DAO.repository.ProduitRepository;
import tn.espritSpring.DAO.repository.StockRepository;

@Service

public class ProduitServiceImpl implements IProduitService {

	  @Autowired
    ProduitRepository pr;
    @Autowired
    StockRepository stockRepository;
    @Autowired
    FournisseurRepository fournisseurRepository;
    @Autowired
    DetailFactureRepository detailFactureRepository;
	
	@Override
	public List<Produit> retrieveAllProduits() {
		
		return (List<Produit>) pr.findAll() ;
	}
  @Transactional
	@Override
	public Produit addProduit(Produit p, Long idRayon, Long idStock) {
		
		
		RayonServiceImpl rsi = new RayonServiceImpl();
		Rayon r = rsi.retrieveRayon(idRayon);
		
		StockServiceImpl ssi = new StockServiceImpl();
		Stock s = ssi.retrieveStock(idStock);
			
		p.setRayon(r);
		p.setStock(s);
	
		
		return pr.save(p);
	}
  
  

	@Override
	public Produit retrieveProduit(Long id) {
		
		return pr.findById(id).get();
	}
	@Override
	public Produit addProduitSimple(Produit p) {
	
		return pr.save(p);
	}
	
	
	@Override
	public void assignProduitToStock(Long idProduit, Long idStock) {
	
		Produit p = pr.findById(idProduit).orElse(null);
		Stock s = stockRepository.findById(idStock).orElse(null);
		
		p.setStock(s);
		
		pr.save(p);
		
	}
	@Override
	public void assignFournisseurToProduit(Long fournisseurId, Long produitId) {
		
		Produit p = pr.findById(produitId).orElse(null);
		Fournisseur f = fournisseurRepository.findById(fournisseurId).orElse(null);
		p.getFournisseurs().add(f);
		
		pr.save(p);
		
		
	}
	@Override
	public float getRevenuBrutProduit(Long idProduit, Date startDate, Date endDate) {
		
		//Produit p = pr.findById(idProduit).orElse(null);
		
		//List<DetailFacture> dfs = detailFactureRepository.findFacturesByProduit(p);
		
		return (float) 0.1;
		
	
		
	}


}
