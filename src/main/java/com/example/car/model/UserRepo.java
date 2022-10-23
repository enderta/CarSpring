package com.example.car.model;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepo extends CrudRepository<User, Long> {
	Optional<User> findByUsername(String username);
	Optional<User> findById(Long id);



}