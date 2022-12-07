package com.vuelos.vuelosrestAPI.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.vuelos.vuelosrestAPI.entity.Airline;
import com.vuelos.vuelosrestAPI.service.AirlineService;

//ESTE VA DE QUINTAS, Luego de ArilineServiceImpl

@RestController
@RequestMapping("api/v1/aerolineas")
@CrossOrigin(origins = "*")
public class AirlineController {
	
	private AirlineService airlineService;

	public AirlineController(AirlineService airlineService) {
		super();
		this.airlineService = airlineService;
	} 
	
	@GetMapping("/getAerolineas")
	public ResponseEntity<List<Airline>> getAerolineas(){
		return ResponseEntity.ok(airlineService.getAerolineas());
	}
}
