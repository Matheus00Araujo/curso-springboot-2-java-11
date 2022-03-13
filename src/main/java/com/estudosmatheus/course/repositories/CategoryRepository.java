package com.estudosmatheus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosmatheus.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
