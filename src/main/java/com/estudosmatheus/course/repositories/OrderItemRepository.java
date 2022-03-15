package com.estudosmatheus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosmatheus.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
