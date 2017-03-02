package com.springexample.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springexample.domain.Car;
import com.springexample.domain.CarService;

@Path("car")
@Component
public class CarEndpoint {
	@Autowired
	private CarService carService;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response postCar(Car car) {
		System.out.println("Auto: " + car.getBrand() + " " + car.getBouwjaar());
		this.carService.save(car);
		return Response.accepted(car).build();
	}
}
