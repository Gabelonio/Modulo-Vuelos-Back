package com.vuelos.vuelosrestAPI.service;

import java.util.List;

import com.vuelos.vuelosrestAPI.entity.Airline;

//ESTE VA DE TERCERAS, luego de AirlineRepository.java

public interface AirlineService {

	List<Airline> getAerolineas();
}
