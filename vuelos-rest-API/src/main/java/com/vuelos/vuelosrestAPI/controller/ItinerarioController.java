package com.vuelos.vuelosrestAPI.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vuelos.vuelosrestAPI.entity.Airline;
import com.vuelos.vuelosrestAPI.entity.Airport;
import com.vuelos.vuelosrestAPI.entity.Conexion;
import com.vuelos.vuelosrestAPI.entity.Flight;
import com.vuelos.vuelosrestAPI.entity.FlightSegment;
import com.vuelos.vuelosrestAPI.entity.Itinerario;
import com.vuelos.vuelosrestAPI.entity.Place;
import com.vuelos.vuelosrestAPI.repository.AirlineRepository;
import com.vuelos.vuelosrestAPI.repository.AirportRepository;
import com.vuelos.vuelosrestAPI.repository.ConexionRepository;
import com.vuelos.vuelosrestAPI.repository.FlightRepository;
import com.vuelos.vuelosrestAPI.repository.FlightSegmentRepository;
import com.vuelos.vuelosrestAPI.repository.PlaceRepository;

@RestController
@RequestMapping("api/v1/itinerario")
@CrossOrigin(origins = "*")
public class ItinerarioController {

	@Autowired
	private AirlineRepository repositorioAerolinea;
	List<Airline> aerolineas;
	@Autowired
	private FlightRepository repositorioVuelo;
	List<Flight> vuelos;
	@Autowired
	private FlightSegmentRepository repositorioSegmentosDeVuelo;
	List<FlightSegment> segmentosDeVuelos;
	@Autowired
	private ConexionRepository repositorioConexion;
	List<Conexion> conexiones;
	@Autowired
	private AirportRepository repositorioAeropuerto;
	List<Airport> aeropuertos;
	@Autowired
	private PlaceRepository repositorioPlace;
	List<Place> lugares;
	
	private List<Itinerario> itinerarios;
	
	/*
	@GetMapping ("/getItinerarios")
	public List<Itinerario> getItinerarios(@RequestParam("aeropuertoOrigen")String aeropuertoOrigen, @RequestParam("aeropuertoDestino")String aeropuertoDestino, @RequestParam("fechaOrigen") Date fechaOrigen){
		
		
		
		
		return itinerarios;
	}
	*/
	
	//Para testear con el backend
	@GetMapping ("/getItinerarios/{aeropuertoOrigen}/{aeropuertoDestino}/{fechaOrigen}")
	public List<Itinerario> getItinerarios(@PathVariable String aeropuertoOrigen,@PathVariable String aeropuertoDestino,@PathVariable Date fechaOrigen){
		
		initRepositorios();
		//Ir llenando itinerarios, primero por vuelos directos, y después mediante por conexiones si hay.
		
		return itinerarios;
	}

	private void initRepositorios() {
		
		aerolineas = repositorioAerolinea.getAerolineas();
		vuelos = repositorioVuelo.getVuelos();
		segmentosDeVuelos = repositorioSegmentosDeVuelo.getSegmentosVuelos();
		conexiones = repositorioConexion.getConexiones();
		aeropuertos = repositorioAeropuerto.getAeropuertos();
		lugares = repositorioPlace.getLugares();
	}

}
