package com.carbooking.services;

import java.util.List;

import com.carbooking.entities.User;

public interface UserService {
	public User saveUser(User user);

	public List<User> findAll();

	public User findById(Long id);

	User findByEmail(String email);

	boolean existsByEmail(String email);
}
