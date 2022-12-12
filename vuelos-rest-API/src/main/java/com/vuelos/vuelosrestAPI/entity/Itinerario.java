package com.vuelos.vuelosrestAPI.entity;

import java.util.List;

public class Itinerario {

	//List<SegmentoItinerario> itinerario;
	String itinerario;
	
	public Itinerario () {
		
	}

	public Itinerario(String itinerario) {
		super();
		this.itinerario = itinerario;
	}

	public String getItinerario() {
		return itinerario;
	}

	public void setItinerario(String itinerario) {
		this.itinerario = itinerario;
	}
	
	
	
	/*
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
	
	*/
	
}
