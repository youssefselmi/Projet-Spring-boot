package tn.espritSpring.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;


import tn.espritSpring.DAO.entites.Fournisseur;
import tn.espritSpring.DAO.entites.Produit;
import tn.espritSpring.DAO.repository.DetailProduitRepository;
import tn.espritSpring.DAO.repository.FournisseurRepository;

@Service
public class FournisseurServiceImpl implements IFournisseurService {

	@Autowired
	FournisseurRepository fournisseurrepository;

	@Override
	public List<Fournisseur> retrieveAllFournisseur() {
		List<Fournisseur> four =(List<Fournisseur> )fournisseurrepository.findAll();

		for (Fournisseur f: four){
			
			System.out.println("test");
		}
		return four;
	}
	@Override
	public Fournisseur addFournisseur(Fournisseur f) {
	return fournisseurrepository.save(f);
		
	//	return fournisseurrepository.flush(f);
	}

	@Override
	public void deleteFournisseur(Long id) {
		fournisseurrepository.deleteById(id);
		
	}
	
	
	
	

	@Override
	public Fournisseur updateFournisseur(Fournisseur f) {
		fournisseurrepository.save(f);
		return f;
	}

	
	
/*
	@Override
	public Fournisseur updateF(Fournisseur f, Long id) {
		saveF(f,id);

		 @Query("update Fournisseur e set e.code = code, e.libelle = libelle, e.image_fournisseur = image_fournisseur, e.date_fin_contrat = date_fin_contrat where e.id_fournisseur = id_fournisseur")
	
		
		return f;
	}
	
	*/
	
	
	@Override
	public Fournisseur retrieveFournisseur(Long id) {
		
		Fournisseur fournisseur = null;
		try {
			fournisseur=fournisseurrepository.findById(id).get();
			} catch (Exception e) {	
			}
	return fournisseur;
	// return 	fournisseurrepository.findById(id).get();
		
	}
	


}
