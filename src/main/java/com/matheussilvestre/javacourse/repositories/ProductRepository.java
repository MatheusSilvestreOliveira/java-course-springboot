package com.matheussilvestre.javacourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheussilvestre.javacourse.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

	
	
}
