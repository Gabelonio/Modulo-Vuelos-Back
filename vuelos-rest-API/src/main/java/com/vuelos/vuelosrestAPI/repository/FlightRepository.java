package com.vuelos.vuelosrestAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vuelos.vuelosrestAPI.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, String>{
	
	@Query(value = "SELECT * FROM FLIGHT", nativeQuery = true)
	List<Flight> getVuelos();
	
	@Query(value = "SELECT F.FLIGHT_AIRLINECODE_PK, F.FLIGHTNUMBER_PK "
					+ "FROM FLIGHT F, AIRLINE A "
					+ "WHERE (F.FLIGHT_AIRLINECODE_PK = AIRLINECODE_PK) AND F.FLIGHT_AIRLINECODE_PK = :aerolinea", nativeQuery = true)
	List<Flight> getVuelosFromAerolinea(String aerolinea);
	
}
