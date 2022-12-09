package com.vuelos.vuelosrestAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vuelos.vuelosrestAPI.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, String>{
	
	@Query(value = "SELECT FLIGHT_AIRLINECODE_PK, FLIGHTNUMBER_PK "
					+ "FROM FLIGHT "
					+ "WHERE FLIGHT_AIRLINECODE_PK = :aerolinea", nativeQuery = true)
	List<Flight> getVuelosFromAerolinea(String aerolinea);
	
}
