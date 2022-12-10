package com.vuelos.vuelosrestAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vuelos.vuelosrestAPI.entity.Place;
import com.vuelos.vuelosrestAPI.entity.PlaceLlaveCompuesta;

public interface PlaceRepository extends JpaRepository <Place, PlaceLlaveCompuesta> {
	
	@Query (value = "SELECT * FROM PLACE", nativeQuery = true)
	List<Place> getLugares();
	

}
