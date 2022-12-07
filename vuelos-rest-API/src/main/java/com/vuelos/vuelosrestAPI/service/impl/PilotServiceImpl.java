package com.vuelos.vuelosrestAPI.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vuelos.vuelosrestAPI.entity.Pilot;
import com.vuelos.vuelosrestAPI.repository.PilotRepository;
import com.vuelos.vuelosrestAPI.service.PilotService;

@Service
public class PilotServiceImpl implements PilotService{
	
	private PilotRepository pilotRepository;
	

	public PilotServiceImpl(PilotRepository pilotRepository) {
		super();
		this.pilotRepository = pilotRepository;
	}

	@Override
	public List<Pilot> getPilotos() {
		List<Pilot> pilotos = pilotRepository.getPilotos();
		return pilotos;
	}

}
