package com.vuelos.vuelosrestAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vuelos.vuelosrestAPI.entity.PilotAssignment;
import com.vuelos.vuelosrestAPI.repository.PilotAssignmentRepository;

@RestController
@RequestMapping("api/v1/pilotosAsignados")
@CrossOrigin(origins = "*")
public class PilotAssignmentController {
	
	@Autowired
	private PilotAssignmentRepository repositorio;
	
	@GetMapping("/getPilotosAsignados")
	public List<PilotAssignment> getPilotosAsignados(){
		return repositorio.getPilotosAsignados();
	}
	
	@PostMapping("/setAsignarPiloto")
	public PilotAssignment setAsignarPiloto (@RequestBody PilotAssignment pilotAssignment) {
		return repositorio.save(pilotAssignment);
	}

}
