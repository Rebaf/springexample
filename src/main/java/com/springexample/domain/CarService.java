package com.springexample.domain;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CarService {
	// methodes die je op de database gaat uitvoeren

	@Autowired // verbinding met repository
	private CarRepository carRepository;
	
	public Iterable <Car> findAll() {
		Iterable <Car> result = this.carRepository.findAll();
		return result;
	}

	public void save(Car car) {
		this.carRepository.save(car);
	}
}
