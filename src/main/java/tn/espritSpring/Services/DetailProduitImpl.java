package tn.espritSpring.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.espritSpring.DAO.entites.DetailProduit;
import tn.espritSpring.DAO.entites.Produit;
import tn.espritSpring.DAO.repository.DetailProduitRepository;

@Service
public class DetailProduitImpl implements IDetailProduitService {
	@Autowired
	DetailProduitRepository detailproduit;
	
	
	@Override
	public List<DetailProduit> retrieveAllDetailProduit() {
		
		List<DetailProduit> detailproduits =(List<DetailProduit> )detailproduit.findAll();

		for (DetailProduit dp: detailproduits){
			
			System.out.println("test");
		}
		return detailproduits;

		}
	

	@Override
	public DetailProduit addDetailProduit(DetailProduit p) {
		return detailproduit.save(p);
	}

	@Override
	public void deleteDetailProduit(Long id) {
		detailproduit.deleteById(id);
	}

	@Override
	public DetailProduit updateDetailProduit(DetailProduit p) {
		detailproduit.save(p);
		return  p;
	}

	@Override
	public DetailProduit retrieveDetailProduit(Long id) {
		return detailproduit.findById(id).get();
	}

}
