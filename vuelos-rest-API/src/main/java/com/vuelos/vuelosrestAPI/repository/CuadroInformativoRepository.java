package com.vuelos.vuelosrestAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vuelos.vuelosrestAPI.entity.CuadroInformativo;
import com.vuelos.vuelosrestAPI.entity.CuadroInformativoLlaveCompuesta;

public interface CuadroInformativoRepository extends JpaRepository <CuadroInformativo, CuadroInformativoLlaveCompuesta>{
	
	@Query(value = "SELECT DISTINCT Fl.FLIGHTSEGMENT_AIRLINECODE_PK as aerolinea_vuelo, Fl.FLIGHTSEGMENT_FLIGHTNUMBER_PK as numero_vuelo, \r\n"
			+ "                Airline.AIRLINENAME as nombre_aerolinea, Airport.AIRPORTNAME as nombre_aeropuerto, \r\n"
			+ "                Ciudad.PLACENAME as ciudad_aeropuerto, Divison.PLACE_DESPLACETYPE_PK as descripcion_division_aeropuerto, \r\n"
			+ "                Divison.PLACENAME as nombre_division_aeropuerto, Pais.PLACENAME as nombre_pais_aeropuerto, \r\n"
			+ "                Fl.FLIGHTSEGMENT_FECHAVUELO as fecha_vuelo, Fl.FLIGHTSEGMENT_DURACION as duracion_vuelo, \r\n"
			+ "                Person.NAME as nombre_piloto \r\n"
			+ "FROM FLIGHTSEGMENT Fl, FLIGHT Flight, AIRLINE Airline, AIRPORT Airport, \r\n"
			+ "     PLACE Ciudad, PLACE Divison, PLACE Pais,\r\n"
			+ "     PILOTASSIGNMENT Passignment, PILOT Piloto, EMPLOYEE Emp, PERSON Person\r\n"
			+ "WHERE  Fl.FLIGHTSEGMENT_AIRLINECODE_PK = Airline.AIRLINECODE_PK \r\n"
			+ "    AND (Fl.FLIGHTSEGMENT_AIRPORTCODE_PK = Airport.AIRPORT_AIRPORTCODE_PK OR Fl.FS_AIR_AIRPORTCODE_PK = Airport.AIRPORT_AIRPORTCODE_PK)\r\n"
			+ "    AND Airport.AIRPORT_IDPLACE_PK = Ciudad.PLACE_IDPLACE_PK\r\n"
			+ "    AND Ciudad.PLA_IDPLACE_PK = Divison.PLACE_IDPLACE_PK\r\n"
			+ "    AND Divison.PLA_IDPLACE_PK = Pais.PLACE_IDPLACE_PK\r\n"
			+ "    AND Fl.FLIGHTSEGMENT_FLIGHTNUMBER_PK = Passignment.PA_FLIGHTNUMBER_PK\r\n"
			+ "    AND Fl.FLIGHTSEGMENT_AIRPORTCODE_PK = Passignment.AIRPORTCODE_PK\r\n"
			+ "    AND Passignment.PA_PILOTLICENSE_PK = Piloto.PILOTLICENSE_PK\r\n"
			+ "    AND Piloto.CONEXION_EMPLOYEENUMBER_PK = Emp.EMPLOYEENUMBER_PK\r\n"
			+ "    AND Emp.EMPLOYEE_IDPERSON_PK = Person.IDPERSON_PK\r\n"
			+ "    AND ROWNUM = 1\r\n"
			+ "    AND Fl.FLIGHTSEGMENT_FLIGHTNUMBER_PK = :numeroVuelo\r\n"
			+ "    AND Fl.FLIGHTSEGMENT_AIRLINECODE_PK = :codigoAerolinea \r\n"
			+ "    AND Airport.AIRPORT_AIRPORTCODE_PK = :codigoAeropuerto ", nativeQuery = true)
	List<CuadroInformativo> getCuadrosInformativos(String numeroVuelo, String codigoAerolinea, String codigoAeropuerto);
}
/*
"SELECT DISTINCT Fl.FLIGHTSEGMENT_AIRLINECODE_PK as aerolineaVuelo, Fl.FLIGHTSEGMENT_FLIGHTNUMBER_PK as numeroVuelo,  "
+ "                Airline.AIRLINENAME as nombreAerolinea, Airport.AIRPORTNAME as nombreAeropuerto,  "
+ "                Ciudad.PLACENAME as ciudadAeropuerto, Divison.PLACE_DESPLACETYPE_PK as descripcionDivisionAeropuerto,  "
+ "                Divison.PLACENAME as nombreDivisionAeropuerto, Pais.PLACENAME as nombre_pais_aeropuerto,  "
+ "                Fl.FLIGHTSEGMENT_FECHAVUELO as fechaVuelo, Fl.FLIGHTSEGMENT_DURACION as duracionVuelo,  "
+ "                Person.NAME as nombrePiloto  "
+ "FROM FLIGHTSEGMENT Fl, FLIGHT Flight, AIRLINE Airline, AIRPORT Airport,  "
+ "     PLACE Ciudad, PLACE Divison, PLACE Pais, "
+ "     PILOTASSIGNMENT Passignment, PILOT Piloto, EMPLOYEE Emp, PERSON Person "
+ "WHERE  Fl.FLIGHTSEGMENT_AIRLINECODE_PK = Airline.AIRLINECODE_PK  "
+ "    AND Fl.FLIGHTSEGMENT_AIRPORTCODE_PK = Airport.AIRPORT_AIRPORTCODE_PK "
+ "    AND Airport.AIRPORT_IDPLACE_PK = Ciudad.PLACE_IDPLACE_PK "
+ "    AND Ciudad.PLA_IDPLACE_PK = Divison.PLACE_IDPLACE_PK "
+ "    AND Divison.PLA_IDPLACE_PK = Pais.PLACE_IDPLACE_PK "
+ "    AND Fl.FLIGHTSEGMENT_FLIGHTNUMBER_PK = Passignment.PA_FLIGHTNUMBER_PK "
+ "    AND Fl.FLIGHTSEGMENT_AIRPORTCODE_PK = Passignment.AIRPORTCODE_PK "
+ "    AND Passignment.PA_PILOTLICENSE_PK = Piloto.PILOTLICENSE_PK "
+ "    AND Piloto.CONEXION_EMPLOYEENUMBER_PK = Emp.EMPLOYEENUMBER_PK "
+ "    AND Emp.EMPLOYEE_IDPERSON_PK = Person.IDPERSON_PK "
+ "    AND Fl.FLIGHTSEGMENT_FLIGHTNUMBER_PK = :numeroVuelo "
+ "UNION  "
+ "SELECT DISTINCT Fl.FLIGHTSEGMENT_AIRLINECODE_PK as aerolineaVuelo, Fl.FLIGHTSEGMENT_FLIGHTNUMBER_PK as numeroVuelo,  "
+ "                Airline.AIRLINENAME as nombreAerolinea, Airport.AIRPORTNAME as nombreAeropuerto,  "
+ "                Ciudad.PLACENAME as ciudadAeropuerto, Divison.PLACE_DESPLACETYPE_PK as descripcionDivisionAeropuerto,  "
+ "                Divison.PLACENAME as nombreDivisionAeropuerto, Pais.PLACENAME as nombre_pais_aeropuerto,  "
+ "                Fl.FLIGHTSEGMENT_FECHAVUELO as fechaVuelo, Fl.FLIGHTSEGMENT_DURACION as duracionVuelo,  "
+ "                Person.NAME as nombrePiloto  "
+ "FROM FLIGHTSEGMENT Fl, FLIGHT Flight, AIRLINE Airline, AIRPORT Airport,  "
+ "     PLACE Ciudad, PLACE Divison, PLACE Pais, "
+ "     PILOTASSIGNMENT Passignment, PILOT Piloto, EMPLOYEE Emp, PERSON Person "
+ "WHERE  Fl.FLIGHTSEGMENT_AIRLINECODE_PK = Airline.AIRLINECODE_PK  "
+ "    AND Fl.FS_AIR_AIRPORTCODE_PK = Airport.AIRPORT_AIRPORTCODE_PK "
+ "    AND Airport.AIRPORT_IDPLACE_PK = Ciudad.PLACE_IDPLACE_PK "
+ "    AND Ciudad.PLA_IDPLACE_PK = Divison.PLACE_IDPLACE_PK "
+ "    AND Divison.PLA_IDPLACE_PK = Pais.PLACE_IDPLACE_PK "
+ "    AND Fl.FLIGHTSEGMENT_FLIGHTNUMBER_PK = Passignment.PA_FLIGHTNUMBER_PK "
+ "    AND Fl.FLIGHTSEGMENT_AIRPORTCODE_PK = Passignment.AIRPORTCODE_PK "
+ "    AND Passignment.PA_PILOTLICENSE_PK = Piloto.PILOTLICENSE_PK "
+ "    AND Piloto.CONEXION_EMPLOYEENUMBER_PK = Emp.EMPLOYEENUMBER_PK "
+ "    AND Emp.EMPLOYEE_IDPERSON_PK = Person.IDPERSON_PK "
+ "    AND ROWNUM = 1 "
+ "    AND Fl.FLIGHTSEGMENT_FLIGHTNUMBER_PK = :numeroVuelo "*/
