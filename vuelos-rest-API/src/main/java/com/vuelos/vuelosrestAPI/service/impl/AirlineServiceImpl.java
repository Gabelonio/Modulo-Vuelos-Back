package com.vuelos.vuelosrestAPI.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vuelos.vuelosrestAPI.entity.Airline;
import com.vuelos.vuelosrestAPI.repository.AirlineRepository;
import com.vuelos.vuelosrestAPI.service.AirlineService;

//ESTE VA DE CUARTAS, luego de AirlineService

@Service
public class AirlineServiceImpl implements AirlineService{
	
	private AirlineRepository airlineRepository;
	

	public AirlineServiceImpl(AirlineRepository airlineRepository) {
		super();
		this.airlineRepository = airlineRepository;
	}

	@Override
	public List<Airline> getAerolineas() {
		List<Airline> aerolineas = airlineRepository.getAerolineas();
		return aerolineas;
	}

}
