package com.example.car.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepo extends CrudRepository<Car, Long> {

	List<Car> findByBrand(String brand);
	List<Car> findByColor(String color);

}