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
			+ "WHERE A.AIRPORT_AIRPORTCODE_PK = Fs.FS_AIR_AIRPORTCODE_PK  "
			+ "AND Fs.FLIGHTSEGMENT_FLIGHTNUMBER_PK = :vuelo "
			+ "AND Fs.FS_AIR_AIRPORTCODE_PK IN :aeropuertos ",
			nativeQuery = true)
	List<Airport> getAeropuertosFromVuelo(String vuelo, List<String> aeropuertos);
	
	@Query ( value = "SELECT A.AIRPORT_AIRPORTCODE_PK"
			+" FROM AIRPORT A"
			+" WHERE A.AIRPORT_AIRPORTCODE_PK = (SELECT FS.FLIGHTSEGMENT_AIRPORTCODE_PK"
			+" FROM FLIGHTSEGMENT FS"
			+" WHERE FS.FLIGHTSEGMENT_AIRLINECODE_PK = :aerolinea AND FS.FLIGHTSEGMENT_FLIGHTNUMBER_PK = :numeroVuelo AND FS_AIR_AIRPORTCODE_PK = :aeropuertoOrigen)"
			,nativeQuery = true)
	List<String> getAeropuertoDestinoFromSegmentosDeVuelo(String aerolinea, String numeroVuelo, String aeropuertoOrigen);
	
	
	@Query (value = "SELECT AIRPORT_IDPLACE_PK"
			+" FROM AIRPORT"
			+" WHERE airport_airportcode_pk = :idAeropuerto"
			,nativeQuery = true)
	List<String> getIdPlaceFromIdAeropuerto (String idAeropuerto);
	
	@Query (value = "SELECT AIRPORTNAME"
			+" FROM AIRPORT"
			+" WHERE airport_airportcode_pk = :idAeropuerto"
			,nativeQuery = true)
	List<String> getNomAeropuertoFromIdAeropuerto (String idAeropuerto);
}