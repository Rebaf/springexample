package com.springexample.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface CarRepository extends CrudRepository <Car, Long>{
	
}
