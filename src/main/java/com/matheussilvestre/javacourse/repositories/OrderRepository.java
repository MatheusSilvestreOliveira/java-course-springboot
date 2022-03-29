package com.matheussilvestre.javacourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheussilvestre.javacourse.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

	
	
}
