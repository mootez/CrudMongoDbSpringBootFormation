package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Produit;


public interface ProduitRepository extends MongoRepository<Produit, Long> {
          
}
