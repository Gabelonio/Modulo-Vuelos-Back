package com.vuelos.vuelosrestAPI.entity;

import java.util.List;

public class Itinerario {

	List<SegmentoItinerario> itinerario;
	
	public Itinerario () {
		
	}

	public Itinerario(List<SegmentoItinerario> itinerario) {
		super();
		this.itinerario = itinerario;
	}

	public List<SegmentoItinerario> getItinerario() {
		return itinerario;
	}

	public void setItinerario(List<SegmentoItinerario> itinerario) {
		this.itinerario = itinerario;
	}
	
	
	
}
