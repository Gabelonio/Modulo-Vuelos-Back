package com.vuelos.vuelosrestAPI.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vuelos.vuelosrestAPI.entity.Flight;
import com.vuelos.vuelosrestAPI.repository.FlightRepository;
import com.vuelos.vuelosrestAPI.service.FlightService;

@Service
public class FlightServiceImpl implements FlightService{
	
	private FlightRepository flightRepository;
	
	public FlightServiceImpl(FlightRepository flightRepository) {
		super();
		this.flightRepository = flightRepository;
	}

	@Override
	public List<Flight> getVuelosFromAerolinea(String aerolinea) {
		List<Flight> vuelosAerolinea = flightRepository.getVuelosFromAerolinea(aerolinea);
		return vuelosAerolinea;
	}

}
