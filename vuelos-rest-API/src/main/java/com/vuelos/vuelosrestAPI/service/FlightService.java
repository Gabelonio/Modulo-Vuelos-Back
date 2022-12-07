package com.vuelos.vuelosrestAPI.service;

import java.util.List;

import com.vuelos.vuelosrestAPI.entity.Flight;

public interface FlightService {
	List<Flight> getVuelosFromAerolinea(String aerolinea);
}
