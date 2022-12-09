package com.vuelos.vuelosrestAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vuelos.vuelosrestAPI.entity.PilotAssignment;

public interface PilotAssignmentRepository extends JpaRepository<PilotAssignment,String>{

	
	@Query(value = "SELECT * FROM PILOTASSIGNMENT", nativeQuery = true)
	List<PilotAssignment> getPilotosAsignados();
	
}
