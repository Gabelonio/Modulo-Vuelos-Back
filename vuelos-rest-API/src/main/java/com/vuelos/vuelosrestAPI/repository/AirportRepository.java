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
	
	@Query(value = "SELECT A.AIRPORT_AIRPORTCODE_PK, A.AIRPORT_IDPLACE_PK, A.AIRPORT_AIRPORTYPE_PK, A.AIRPORTNAME "
			+ "FROM AIRPORT A, FLIGHTSEGMENT Fs "
			+ "WHERE A.AIRPORT_AIRPORTCODE_PK = Fs.FS_AIR_AIRPORTCODE_PK AND Fs.FLIGHTSEGMENT_FLIGHTNUMBER_PK = :vuelo",
			nativeQuery = true)
	List<Airport> getAeropuertosFromVuelo(String vuelo);
	
}