package tn.espritSpring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.espritSpring.DAO.entites.Produit;
import tn.espritSpring.Services.IProduitService;


@Controller
public class ProduitController {
	

	@Autowired
	IProduitService produitService;
	
	
	//http://localhost:8089/Magasin/produit/add-produit
		@PostMapping("/add-produit")
		public Produit addProduitSimple(@RequestBody Produit p) {
		return produitService.addProduitSimple(p);
		}
		
		//http://localhost:8089/Magasin/produit/assign-produit-to-stock/1/14
		@PostMapping("/assign-produit-to-stock/{id-produit}/{id-stock}")
		public void assignProduitToStock(@PathVariable("id-produit") Long produitId,@PathVariable("id-stock") Long stockId) {
		produitService.assignProduitToStock(produitId,stockId);
		
		}
		
		//assignFournisseurToProduit
		
		//http://localhost:8089/Magasin/produit/assign-fournisseur-to-produit/1/1
		@PostMapping("/assign-fournisseur-to-produit/{id-produit}/{id-fournisseur}")
		public void assignFournisseurToProduit(@PathVariable("id-fournisseur") Long fournisseurId,@PathVariable("id-produit") Long produitId) {
		produitService.assignFournisseurToProduit(fournisseurId, produitId);
		
		}
		
}
