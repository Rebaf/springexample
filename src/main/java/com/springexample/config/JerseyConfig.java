package com.springexample.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.springexample.service.CarEndpoint;
// import com.springexample.service.PersonFilterEndpoint; van alle endpoints die je gaat maken.


@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		register(CarEndpoint.class);
		//register(PersonFilterEndpoint.class);
	}
}