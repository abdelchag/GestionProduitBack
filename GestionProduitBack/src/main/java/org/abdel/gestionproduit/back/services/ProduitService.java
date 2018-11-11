package org.abdel.gestionproduit.back.services;

import java.util.List;

import org.abdel.gestionproduit.back.dao.ProduitRepository;
import org.abdel.gestionproduit.back.entities.Produit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(path = "/")
@CrossOrigin(value="*")
@Api(value = "GestionProduitControllerAPI", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProduitService {


	@Autowired
	private ProduitRepository repo;
	
	private static final Logger log = LogManager.getLogger(ProduitService.class);
	
	private void log(){
		log.debug("RECHERCHER");
		log.info("RECHERCHER");
		log.warn("RECHERCHER");
		log.error("RECHERCHER");
		log.fatal("RECHERCHER");
	}

	
	@RequestMapping(value = "/produits",method=RequestMethod.GET)
	@ApiOperation("Get all product")
	@ApiResponses(value = {@ApiResponse(code = 200, message = "OK", response = Produit.class, responseContainer = "List"),
							@ApiResponse(code= 500, message = "Erreur Serveur", response = RuntimeException.class),
							@ApiResponse(code= 404, message = "Erreur Client", response = Exception.class)})
	public List<Produit> getAll(){
		return repo.findAll();
	}
	
	@RequestMapping(value="/produits/{id}", method=RequestMethod.GET)
	public Produit getProduitById(@PathVariable("id") Long id){
		return repo.findOne(id);
	}
	
	@RequestMapping(value="/chercher", method=RequestMethod.GET)
	@ApiResponse(code = 200, message = "OK", response = Produit.class, responseContainer = "Page")
	public Page<Produit> getProduitsByDesign(
			@RequestParam(name="design") String designation,
			@RequestParam(defaultValue="0") int page,
			@RequestParam(defaultValue="3") int size){
		this.log();
		
		return repo.chercherParDesignation(designation, new PageRequest(page, size));
	}

	@RequestMapping(value="/ckalab", method=RequestMethod.GET)
	@ApiResponse(code = 200, message = "OK", response = Produit.class, responseContainer = "Page")
	public Page<Produit> getProduitsByDesignation(
			@RequestParam(name="design") String designation,
			@RequestParam(defaultValue="0") int page,
			@RequestParam(defaultValue="3") int size){
		return repo.chercherParDesignation(designation, new PageRequest(page, size));
	}
	
	@RequestMapping(value="/produits", method=RequestMethod.POST)
	@ApiResponse(code = 200, message = "OK", response = Produit.class)
	public Produit saveProduit(@RequestBody Produit produit){
		return repo.save(produit);
	}
	
	@RequestMapping(value="/produits/{id}", method=RequestMethod.DELETE)
	@ApiResponse(code = 200, message = "OK")
	public void deleteProduit(@PathVariable Long id){
		repo.delete(id);
	}
	
	@RequestMapping(value="/produits/{id}", method=RequestMethod.PUT)
	@ApiResponse(code = 200, message = "OK", response = Produit.class)
	public Produit saveProduit(@PathVariable Long id, @RequestBody Produit produit){
		produit.setId(id);
		return repo.saveAndFlush(produit);
	}
	
	

}
