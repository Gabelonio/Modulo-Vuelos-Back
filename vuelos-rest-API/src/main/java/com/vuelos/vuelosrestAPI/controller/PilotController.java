package com.vuelos.vuelosrestAPI.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vuelos.vuelosrestAPI.entity.Pilot;
import com.vuelos.vuelosrestAPI.service.PilotService;

@RestController
@RequestMapping("api/v1/pilotos")
@CrossOrigin(origins = "*")
public class PilotController {

	private PilotService pilotService;

	public PilotController(PilotService pilotService) {
		super();
		this.pilotService = pilotService;
	}
	
	@GetMapping("/getPilotos")
	public ResponseEntity<List<Pilot>> getPilotos(){
		return ResponseEntity.ok(pilotService.getPilotos());
	}
	
}
