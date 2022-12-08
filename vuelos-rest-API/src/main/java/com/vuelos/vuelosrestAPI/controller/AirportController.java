package com.vuelos.vuelosrestAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


import com.vuelos.vuelosrestAPI.entity.Airport;
import com.vuelos.vuelosrestAPI.repository.AirportRepository;


//ESTE VA DE QUINTAS, Luego de ArilineServiceImpl

@RestController
@RequestMapping("api/v1/aeropuertos")
@CrossOrigin(origins = "*")
public class AirportController {
	
	
	@Autowired
	private AirportRepository repositorio;
	
	@GetMapping("/getAeropuertos")
	public List<Airport> getAerolineas(){
		return repositorio.getAeropuertos();
	}
	
	/*
	private AirportService airportService;
	
	public AirportController (AirportService airportService) {
		super();
		this.airportService = airportService;
	}
	
	@GetMapping("/getAeropuertos")
	public ResponseEntity<List<Airport>> getAerolineas(){
		return ResponseEntity.ok(airportService.getAeropuertos());
	}
	*/

}