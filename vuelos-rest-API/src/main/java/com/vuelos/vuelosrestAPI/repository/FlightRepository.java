package com.vuelos.vuelosrestAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vuelos.vuelosrestAPI.entity.Flight;
import com.vuelos.vuelosrestAPI.entity.FlightLlaveCompuesta;

public interface FlightRepository extends JpaRepository<Flight, FlightLlaveCompuesta>{
	

	@Query(value = "SELECT FLIGHT_AIRLINECODE_PK, FLIGHTNUMBER_PK "
					+ "FROM FLIGHT "
					+ "WHERE FLIGHT_AIRLINECODE_PK = :aerolinea", nativeQuery = true)
	List<Flight> getVuelosFromAerolinea(String aerolinea);

	@Query(value = "SELECT * FROM FLIGHT", nativeQuery = true)
	List<Flight> getVuelos();

	
}
