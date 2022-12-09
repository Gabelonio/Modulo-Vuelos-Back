package com.vuelos.vuelosrestAPI.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.vuelos.vuelosrestAPI.entity.Pilot;
import com.vuelos.vuelosrestAPI.repository.PilotRepository;
import com.vuelos.vuelosrestAPI.service.PilotService;

@RestController
@RequestMapping("api/v1/pilotos")
@CrossOrigin(origins = "*")
public class PilotController {

	@Autowired
	private PilotRepository repositorio;
	
	@GetMapping("/getPilotos")
	public List<Pilot> getPilotos(){
		return repositorio.getPilotos();
	}
	

	//Para conectar el fronent
	@GetMapping("/getPilotosFromAerolinea")
	public List<Pilot> getPilotosFromAerolinea(@RequestParam("aerolinea") String aerolinea){
		return repositorio.getPilotosFromAerolinea(aerolinea);
	}

	
	/*
	//Para testear en el backend
	@GetMapping("/getPilotosFromAerolinea/{aerolinea}")
	public List<Pilot> getPilotosFromAerolinea(@PathVariable String aerolinea){
		return repositorio.getPilotosFromAerolinea(aerolinea);
	}
	*/
	
}
