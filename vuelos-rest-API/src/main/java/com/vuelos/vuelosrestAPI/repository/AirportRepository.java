package com.vuelos.vuelosrestAPI.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vuelos.vuelosrestAPI.entity.Airport;

@Repository
public interface AirportRepository extends JpaRepository <Airport, String>{
	
	@Query(value = "SELECT * FROM AIRPORT", nativeQuery = true)
	List<Airport> getAeropuertos();
	
}