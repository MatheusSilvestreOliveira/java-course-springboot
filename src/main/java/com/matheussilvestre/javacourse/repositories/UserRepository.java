package com.matheussilvestre.javacourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheussilvestre.javacourse.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

	
	
}
