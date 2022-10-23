package com.example.controller;


import com.example.car.model.Car;
import com.example.car.model.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
@Autowired
private CarRepo carRepo;
@RequestMapping("/cars")
public Iterable<Car> getCars() {
	return carRepo.findAll();
}
@RequestMapping("/id")
public Car getCarById(Long id) {
	return carRepo.findById(id).get();
}

@PostMapping("/cars")
public Car addCar(Car car) {
	return carRepo.save(car);
}

@DeleteMapping("/id")
public void deleteCar(Long id) {
	carRepo.deleteById(id);
}



}