package com.drones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.drones.dronesspring"})
public class DronesSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DronesSpringApplication.class, args);
	}

}
