package com.estudosmatheus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosmatheus.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
