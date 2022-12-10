package com.vuelos.vuelosrestAPI.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


import com.vuelos.vuelosrestAPI.entity.Airport;
import com.vuelos.vuelosrestAPI.repository.AirportRepository;


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
	
	@GetMapping("/getAeropuertosFromVuelo")
	public List<Airport> getAeropuertosFromVuelo(@RequestParam("vuelo") String vuelo, @RequestParam("aeropuertos") List<String> aeropuertos){
		return repositorio.getAeropuertosFromVuelo(vuelo, aeropuertos);
	}
	
	//Para conectar con el front
	@GetMapping("/getAeropuertoDestinoFromSegmentosDeVuelo")
	public List <String> getAeropuertoDestinoFromSegmentosDeVuelo (@RequestParam("aerolinea") String aerolinea, @RequestParam("numeroVuelo") String numeroVuelo, @RequestParam("aeropuertoOrigen") String aeropuertoOrigen){
		return repositorio.getAeropuertoDestinoFromSegmentosDeVuelo(aerolinea, numeroVuelo, aeropuertoOrigen);
	}
		
	/*
	//Para testear en el backend
	@GetMapping("/getAeropuertoDestinoFromSegmentosDeVuelo/{aerolinea}/{numeroVuelo}/{aeropuertoOrigen}")
	public List <Airport> getAeropuertoDestinoFromSegmentosDeVuelo (@PathVariable String aerolinea, @PathVariable  String numeroVuelo, @PathVariable String aeropuertoOrigen){
		return repositorio.getAeropuertoDestinoFromSegmentosDeVuelo(aerolinea, numeroVuelo, aeropuertoOrigen);
	}
	*/

}