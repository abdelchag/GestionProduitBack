package org.abdel.gestionproduit.back.services;

import java.util.List;

import org.abdel.gestionproduit.back.dao.ProduitRepository;
import org.abdel.gestionproduit.back.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProduitService {
	
	@Autowired
	private ProduitRepository repo;
	
	@RequestMapping(value="/produits", method=RequestMethod.GET)
	public List<Produit> getAll(){
		return repo.findAll();
	}
	
	@RequestMapping(value="/produits/{id}", method=RequestMethod.GET)
	public Produit getProduitById(@PathVariable("id") Long id){
		return repo.findOne(id);
	}
	
	@RequestMapping(value="/chercher", method=RequestMethod.GET)
	public Page<Produit> getProduitsByDesign(
			@RequestParam(name="design") String designation,
			@RequestParam(defaultValue="0") int page,
			@RequestParam(defaultValue="3") int size){
		return repo.chercherParDesignation(designation, new PageRequest(page, size));
	}
	
	@RequestMapping(value="/produits", method=RequestMethod.POST)
	public Produit saveProduit(@RequestBody Produit produit){
		return repo.save(produit);
	}
	
	@RequestMapping(value="/produits/{id}", method=RequestMethod.DELETE)
	public void saveProduit(@PathVariable Long id){
		repo.delete(id);
	}
	
	@RequestMapping(value="/produits/{id}", method=RequestMethod.PUT)
	public Produit saveProduit(@PathVariable Long id, @RequestBody Produit produit){
		produit.setId(id);
		return repo.saveAndFlush(produit);
	}
	
	

}
