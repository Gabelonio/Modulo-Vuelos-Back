package com.vuelos.vuelosrestAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vuelos.vuelosrestAPI.entity.FlightSegment;
import com.vuelos.vuelosrestAPI.repository.FlightSegmentRepository;

@RestController
@RequestMapping("api/v1/segmentosVuelos")
@CrossOrigin(origins = "*")
public class FlightSegmentController {
	
	@Autowired
	private FlightSegmentRepository repositorio;
	
	@GetMapping("/getSegmentosVuelos")
	public List<FlightSegment> getSegmentosVuelos(){
		
		return repositorio.getSegmentosVuelos();
	}
	
	//Para conectar con el frontend
	@GetMapping("/getSegmentosVuelo")
	public List<FlightSegment> getSegmentosVuelo (@RequestParam("aerolinea") String aerolinea, @RequestParam("numeroVuelo") String numeroVuelo){
		return repositorio.getSegmentosVuelo(aerolinea, numeroVuelo);
	}
	
	
	
	@PostMapping("/setSegmentoVuelo")
	public FlightSegment setFlightSegment (@RequestBody FlightSegment flightSegment) {
		return repositorio.save(flightSegment);
	}

	/*
	//Para testear con el backend
	@GetMapping("/getSegmentosVuelo/{aerolinea}/{numeroVuelo}")
	public List<FlightSegment> getSegmentosVuelo (@PathVariable String aerolinea, @PathVariable String numeroVuelo){
		return repositorio.getSegmentosVuelo(aerolinea, numeroVuelo);
	}
	*/
	

	
}
