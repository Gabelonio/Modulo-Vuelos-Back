package com.vuelos.vuelosrestAPI.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vuelos.vuelosrestAPI.entity.Flight;

import com.vuelos.vuelosrestAPI.repository.FlightRepository;


@RestController
@RequestMapping("api/v1/vuelos")
@CrossOrigin(origins = "*")
public class FlightController {
	
	@Autowired
	private FlightRepository repositorio;
	
	@GetMapping("/getVuelos")
	public List<Flight> getPilotos(){
		return repositorio.getVuelos();
	}
	
	//Para conectar con el frontend
	@GetMapping("/getVuelosFromAerolinea")
	public List<Flight> getAerolineas(@RequestParam("aerolinea") String aerolinea){
		return repositorio.getVuelosFromAerolinea(aerolinea);
	}
	
	/*@PostMapping("/setVuelo")*/
	@RequestMapping(value = "/setVuelo", produces = "application/json", method=RequestMethod.POST)
	public Flight setFlight (@RequestBody Flight flight) {
		return repositorio.save(flight);
	}
	
	/*
	//Para testear el backend
	@GetMapping("/getVuelosFromAerolinea/{aerolinea}")
	public List<Flight> getAerolineas(@PathVariable String aerolinea){
		return repositorio.getVuelosFromAerolinea(aerolinea);
	}
	*/
	

}
