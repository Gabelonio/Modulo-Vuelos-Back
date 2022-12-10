package com.vuelos.vuelosrestAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vuelos.vuelosrestAPI.entity.FlightSegment;
import com.vuelos.vuelosrestAPI.entity.FlightSegmentLlaveCompuesta;


public interface FlightSegmentRepository extends JpaRepository<FlightSegment, FlightSegmentLlaveCompuesta> {
	
	@Query(value = "SELECT * FROM FLIGHTSEGMENT", nativeQuery = true)
	List<FlightSegment> getSegmentosVuelos();
	
	@Query (value = "SELECT FS.*"
			+ " FROM FLIGHTSEGMENT FS, FLIGHT F, AIRPORT A"
			+" WHERE (FS.FLIGHTSEGMENT_AIRLINECODE_PK = F.FLIGHT_AIRLINECODE_PK) AND (FS.FLIGHTSEGMENT_FLIGHTNUMBER_PK = F.FLIGHTNUMBER_PK) AND (FS.FLIGHTSEGMENT_AIRPORTCODE_PK = A.AIRPORT_AIRPORTCODE_PK)"
			+" AND F.FLIGHT_AIRLINECODE_PK = :aerolinea AND F.FLIGHTNUMBER_PK = :numeroVuelo"
			,nativeQuery = true)
	List<FlightSegment> getSegmentosVuelo(String aerolinea, String numeroVuelo);

}
