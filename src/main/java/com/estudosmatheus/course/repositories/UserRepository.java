package com.estudosmatheus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosmatheus.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
