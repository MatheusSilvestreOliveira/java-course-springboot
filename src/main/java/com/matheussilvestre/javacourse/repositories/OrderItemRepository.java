package com.matheussilvestre.javacourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheussilvestre.javacourse.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
	
}
