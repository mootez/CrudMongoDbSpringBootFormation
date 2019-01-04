package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ProduitRepository;
import com.example.demo.entities.Produit;

@RestController
public class ProduitController {
    
	@Autowired
	private ProduitRepository produitRepository ;
	
	@GetMapping(value="getProduit/{id}")
	public Produit getProuit(@PathVariable Long id) {
		Optional<Produit> optinalEntity = produitRepository.findById(id);
		return optinalEntity.get();
	}
	
	@GetMapping(value="getAllProduit")
	public List<Produit> getAllProuit() {
		return produitRepository.findAll();        
	}
	
	@PostMapping(value="saveProduit")
	public boolean createProduit(@RequestBody Produit produit) {
		
		Optional<Produit> optinalEntity = produitRepository.findById(produit.getIdProduit());
		
		if(!optinalEntity.isPresent()) {
			try {
				produitRepository.insert(produit);
			return true ;
			} catch(DataAccessException  ex) {
				
			}
		}	
		return false ;
	}
	
	@DeleteMapping(value="deleteProduit/{id}")
	public void deleteProuit(@PathVariable Long id) {
		produitRepository.deleteById(id);      
	}
	
	
}
