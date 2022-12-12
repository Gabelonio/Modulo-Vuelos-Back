package com.vuelos.vuelosrestAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vuelos.vuelosrestAPI.entity.CuadroInformativo;
import com.vuelos.vuelosrestAPI.repository.CuadroInformativoRepository;

@RestController
@RequestMapping("api/v1/cuadrosInformativos")
@CrossOrigin(origins = "*")
public class CuadroInformativoController {
	@Autowired
	private CuadroInformativoRepository repositorio;
	
	@GetMapping("/getCuadrosInformativos")
	public List<CuadroInformativo> getCuadrosInformativos(@RequestParam("numeroVuelo") String numeroVuelo,
														  @RequestParam("codigoAerolinea") String codigoAerolinea,
														  @RequestParam("codigoAeropuerto") String codigoAeropuerto){
		return repositorio.getCuadrosInformativos(numeroVuelo, codigoAerolinea, codigoAeropuerto);
	}
}
