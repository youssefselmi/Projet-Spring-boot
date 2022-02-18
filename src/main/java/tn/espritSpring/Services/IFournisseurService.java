package tn.espritSpring.Services;

import java.util.List;

import tn.espritSpring.DAO.entites.Fournisseur;


public interface IFournisseurService {
	 List<Fournisseur> retrieveAllFournisseur();
	 Fournisseur addFournisseur(Fournisseur f);
	 void deleteFournisseur(Long id);
	 Fournisseur updateFournisseur(Fournisseur f);
	 Fournisseur retrieveFournisseur(Long id);
	 
}
