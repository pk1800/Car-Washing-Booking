package com.carbooking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carbooking.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	 boolean existsByEmail(String email);
	    User findByEmail(String email);
}
