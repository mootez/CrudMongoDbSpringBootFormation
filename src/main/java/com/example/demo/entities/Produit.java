package com.example.demo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Produits")
public class Produit {
	
	@Id
	private Long idProduit;
	private String nomProduit;
	private String desciption;
	private String image;
	
	public Produit() {	
	}
	
	public Produit(Long idProduit, String nomProduit, String desciption, String image) {
		super();
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
		this.desciption = desciption;
		this.image = image;
	}

	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	
}
