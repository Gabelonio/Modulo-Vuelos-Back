package com.vuelos.vuelosrestAPI.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vuelos.vuelosrestAPI.entity.Flight;
import com.vuelos.vuelosrestAPI.service.FlightService;

@RestController
@RequestMapping("api/v1/vuelos")
@CrossOrigin(origins = "*")
public class FlightController {
	
	private FlightService flightService;

	public FlightController(FlightService flightService) {
		super();
		this.flightService = flightService;
	}
	
	@GetMapping("/getVuelosFromAerolinea")
	public ResponseEntity<List<Flight>> getAerolineas(@RequestParam("aerolinea") String aerolinea){
		return ResponseEntity.ok(flightService.getVuelosFromAerolinea(aerolinea));
	}
	
}
