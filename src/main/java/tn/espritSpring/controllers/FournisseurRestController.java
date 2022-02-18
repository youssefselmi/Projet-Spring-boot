package tn.espritSpring.controllers;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import tn.espritSpring.DAO.entites.Client;
import tn.espritSpring.DAO.entites.Fournisseur;
import tn.espritSpring.Services.IFournisseurService;

@RestController
@RequestMapping("/fournisseur")
@CrossOrigin(origins = "http://localhost:4200")
@Api(tags = "Fournisseur management")
public class FournisseurRestController {

	@Autowired
	IFournisseurService fournisseurService;
	// http://localhost:8089/SpringMVC/fournisseur/retrieveFournisseurs
	@GetMapping("retrieveFournisseurs")
	@ResponseBody
	@ApiOperation(value = "Récupérer la liste des fournisseurs")
	public List<Fournisseur> getFournisseurs() {
	List<Fournisseur> listF = fournisseurService.retrieveAllFournisseur();
	return listF;
	}
	///////////////////////////////////////////////////////////

	// http://localhost:8089/SpringMVC/fournisseur/retrieve-fournisseur/1
	@GetMapping("retrieve-fournisseur/{fournisseur-id}")
	@ApiOperation(value = "Récupérer un fournisseurs par id")
	public Fournisseur retrieveFournisseur(@PathVariable("fournisseur-id") Long fournisseurtId){
		return fournisseurService.retrieveFournisseur(fournisseurtId);
	}
	////////////////////////////////////////////////////////////////
	
	
	// http://localhost:8089/SpringMVC/fournisseur/remove-fournisseur/1
	@DeleteMapping("/remove-fournisseur/{fournisseur-id}")
	@ResponseBody
	@ApiOperation(value = "Supprimer un fournisseurs par id")

	public void removeFournisseur(@PathVariable("fournisseur-id") Long fournisseurtId) {
		fournisseurService.deleteFournisseur(fournisseurtId);
	}
	
		
	////////////////////////////////////////////////////////////////////////
	
	// http://localhost:8089/SpringMVC/fournisseur/add-fournisseur
	 @PostMapping("/add-fournisseur")
	 @ResponseBody
	 @ApiOperation(value = "Ajouter un fournisseurs dasn la liste")
	 public Fournisseur addFournisseur(@RequestBody Fournisseur c)
	{
	Fournisseur fournisseur = fournisseurService.addFournisseur(c);
	 return fournisseur;
	 }
	 /////////////////////////////////////////////////////////////////////////
	 
	 
	// http://localhost:8089/SpringMVC/fournisseur/modify-fournisseur
	 @PutMapping("/modify-fournisseur")
	@ApiOperation(value = "Modifier un fournisseurs par id")
	 public Fournisseur modifyFournisseur(@RequestBody Fournisseur fournisseur) {
	 return fournisseurService.updateFournisseur(fournisseur);
	 }

	 ////////////////////////////////////////////////////////////////////////////////

	
	
	
	
	
	
}
