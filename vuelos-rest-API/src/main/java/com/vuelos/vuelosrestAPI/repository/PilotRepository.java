package com.vuelos.vuelosrestAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vuelos.vuelosrestAPI.entity.Pilot;

public interface PilotRepository extends JpaRepository<Pilot, String>{
	
	@Query(value = "SELECT Pi.PILOTLICENSE_PK, Pi.PILOTAIRLINECODE_PK, Pi.CONEXION_EMPLOYEENUMBER_PK, Pi.PILOTLICENSEEXPIRATION,"
			       + "P.NAME as \"PILOT_NAME\" FROM  PILOT Pi, EMPLOYEE E, PERSON P WHERE  Pi.CONEXION_EMPLOYEENUMBER_PK = E.EMPLOYEENUMBER_PK AND E.EMPLOYEE_IDPERSON_PK = P.IDPERSON_PK"
		   ,nativeQuery = true)
	List<Pilot> getPilotos();
	
}
