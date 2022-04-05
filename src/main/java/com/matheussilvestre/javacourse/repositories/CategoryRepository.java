package com.matheussilvestre.javacourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheussilvestre.javacourse.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

	
	
}
