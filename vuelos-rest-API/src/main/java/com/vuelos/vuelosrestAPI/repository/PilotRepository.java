package com.vuelos.vuelosrestAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vuelos.vuelosrestAPI.entity.Airline;
import com.vuelos.vuelosrestAPI.entity.Pilot;

@Repository
public interface PilotRepository extends JpaRepository<Pilot, String>{
	
	/*
	@Query(value = "SELECT Pi.PILOTLICENSE_PK, Pi.PILOTAIRLINECODE_PK, Pi.CONEXION_EMPLOYEENUMBER_PK, Pi.PILOTLICENSEEXPIRATION,"
			       + "P.NAME as \"PILOT_NAME\" FROM  PILOT Pi, EMPLOYEE E, PERSON P WHERE  Pi.CONEXION_EMPLOYEENUMBER_PK = E.EMPLOYEENUMBER_PK AND E.EMPLOYEE_IDPERSON_PK = P.IDPERSON_PK"
		   ,nativeQuery = true)
	List<Pilot> getPilotos();
	*/

	@Query(value = "SELECT PILOT.*, NULL NAME FROM PILOT", nativeQuery = true)
	List<Pilot> getPilotos();
	
	@Query (value = "SELECT P.*, PE.NAME"
			+" FROM PILOT P, EMPLOYEE E, PERSON PE, AIRLINE A"
			+" WHERE (P.PILOTAIRLINECODE_PK = E.EMPLOYEE_AIRLINECODE_PK) AND(P.CONEXION_EMPLOYEENUMBER_PK = E.EMPLOYEENUMBER_PK)" 
			+" AND (E.EMPLOYEE_AIRLINECODE_PK = A.AIRLINECODE_PK) AND (E.EMPLOYEE_IDPERSON_PK = PE.IDPERSON_PK)"
			+" AND A.AIRLINECODE_PK = :aerolinea "
			, nativeQuery = true)
	List<Pilot> getPilotosFromAerolinea(String aerolinea);

}
