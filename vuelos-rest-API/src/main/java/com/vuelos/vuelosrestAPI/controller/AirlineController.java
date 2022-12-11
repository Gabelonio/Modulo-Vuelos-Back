package com.vuelos.vuelosrestAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.vuelos.vuelosrestAPI.entity.Airline;
import com.vuelos.vuelosrestAPI.repository.AirlineRepository;


//ESTE VA DE QUINTAS, Luego de ArilineServiceImpl

@RestController
@RequestMapping("api/v1/aerolineas")
@CrossOrigin(origins = "*")
public class AirlineController {
	
	@Autowired
	private AirlineRepository repositorio;
	
	@GetMapping("/getAerolineas")
	public List<Airline> getAerolineas(){
		return repositorio.getAerolineas();
	}
}
