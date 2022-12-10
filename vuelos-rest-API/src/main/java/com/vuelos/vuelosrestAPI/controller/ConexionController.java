package com.vuelos.vuelosrestAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vuelos.vuelosrestAPI.entity.Conexion;
import com.vuelos.vuelosrestAPI.entity.Flight;
import com.vuelos.vuelosrestAPI.repository.ConexionRepository;

@RestController
@RequestMapping("api/v1/conexiones")
@CrossOrigin(origins = "*")
public class ConexionController {
	
	@Autowired
	private ConexionRepository repositorio;
	
	@GetMapping("/getConexiones")
	public List<Conexion> getConexiones(){
		return repositorio.getConexiones();
	}
	
	/*@PostMapping("/setVuelo")*/
	@RequestMapping(value = "/setConexion", produces = "application/json", method=RequestMethod.POST)
	public Conexion setConexion (@RequestBody Conexion conexion) {
		return repositorio.save(conexion);
	}

}
