package com.vuelos.vuelosrestAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vuelos.vuelosrestAPI.entity.Airline;

//ESTE VA DE SEGUNDAS, LUEGO DE Airline.java
@Repository
public interface AirlineRepository extends JpaRepository<Airline, String>{
	
	@Query(value = "SELECT * from Airline", nativeQuery = true)
	List<Airline> getAerolineas();
	
}
