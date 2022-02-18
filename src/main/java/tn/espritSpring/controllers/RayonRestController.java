package tn.espritSpring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import tn.espritSpring.DAO.entites.Fournisseur;
import tn.espritSpring.DAO.entites.Rayon;
import tn.espritSpring.Services.IFournisseurService;
import tn.espritSpring.Services.IRayonService;

@RestController
@RequestMapping("/rayon")
@CrossOrigin(origins = "http://localhost:4200")
@Api(tags = "Rayons management")
public class RayonRestController {
	
	@Autowired
	IRayonService rayonservice;
	// http://localhost:8089/SpringMVC/rayon/retrieveRayons
	@GetMapping("retrieveRayons")
	@ResponseBody
	@ApiOperation(value = "Récupérer la liste des rayons")
	public List<Rayon> getRayons() {
	List<Rayon> listF = rayonservice.retrieveAllRayon();
	return listF;
	}
	
///////////////////////////////////////////////////////////////////////

	// http://localhost:8089/SpringMVC/rayon/retrieve-rayon/1
	@GetMapping("retrieve-rayon/{rayon-id}")
	@ApiOperation(value = "Récupérer un Rayon par id")
	public Rayon retrieveRayon(@PathVariable("rayon-id") Long rtId){
		return rayonservice.retrieveRayon(rtId);
	}

//////////////////////////////////////////////////////////////////////////////
	
	// http://localhost:8089/SpringMVC/rayon/remove-rayon/1
	@DeleteMapping("/remove-rayon/{rayon-id}")
	@ResponseBody
	@ApiOperation(value = "Supprimer un rayon par id")
	public void removeRayon(@PathVariable("rayon-id") Long rayontId) {
		rayonservice.deleteRayon(rayontId);
	}
	
//////////////////////////////////////////////////////////////////////////////////
	
	// http://localhost:8089/SpringMVC/rayon/add-rayon
	 @PostMapping("/add-rayon")
	 @ResponseBody
	 @ApiOperation(value = "Ajouter un rayon dasn la liste")
	 public Rayon addRayon(@RequestBody Rayon c)
	{
		 Rayon r = rayonservice.addRayon(c);
	 return r;
	 }
	 
////////////////////////////////////////////////////////////////////////////
	
	 
		// http://localhost:8089/SpringMVC/rayon/modify-rayon
		 @PutMapping("/modify-rayon")
		 @ResponseBody
		 @ApiOperation(value = "Modifier un rayon par id")
		 public Rayon modifyRayon(@RequestBody Rayon rayon) {
		 return rayonservice.updateRayon(rayon);
		 }
//////////////////////////	////////////////////////////////////////////////
	
	
	
	
	
	
	
	
	

}
