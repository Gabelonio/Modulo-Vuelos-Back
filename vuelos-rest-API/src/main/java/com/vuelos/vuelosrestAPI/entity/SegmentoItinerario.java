package com.vuelos.vuelosrestAPI.entity;

import java.sql.Date;

public class SegmentoItinerario {
	
	private String vueloOrigen = "";
	private String aeropuertoOrigen ="";
	private String ciudadOrigen = "";
	private String divisionOrigen = "";
	private String paisOrigen = "";
	private Date fechaOrigen = null;
	private String horaOrigen = "";
	
	private String vueloDestino = "";
	private String aeropuertoDestino ="";
	private String ciudadDestino = "";
	private String divisionDestino = "";
	private String paisDestino = "";
	private Date fechaDestino = null;
	private String horaDestino = "";
	
	public SegmentoItinerario () {
		
	}

	public SegmentoItinerario(String vueloOrigen, String aeropuertoOrigen, String ciudadOrigen, String divisionOrigen,
			String paisOrigen, Date fechaOrigen, String horaOrigen, String vueloDestino, String aeropuertoDestino,
			String ciudadDestino, String divisionDestino, String paisDestino, Date fechaDestino, String horaDestino) {
		super();
		this.vueloOrigen = vueloOrigen;
		this.aeropuertoOrigen = aeropuertoOrigen;
		this.ciudadOrigen = ciudadOrigen;
		this.divisionOrigen = divisionOrigen;
		this.paisOrigen = paisOrigen;
		this.fechaOrigen = fechaOrigen;
		this.horaOrigen = horaOrigen;
		this.vueloDestino = vueloDestino;
		this.aeropuertoDestino = aeropuertoDestino;
		this.ciudadDestino = ciudadDestino;
		this.divisionDestino = divisionDestino;
		this.paisDestino = paisDestino;
		this.fechaDestino = fechaDestino;
		this.horaDestino = horaDestino;
	}

	public String getVueloOrigen() {
		return vueloOrigen;
	}

	public void setVueloOrigen(String vueloOrigen) {
		this.vueloOrigen = vueloOrigen;
	}

	public String getAeropuertoOrigen() {
		return aeropuertoOrigen;
	}

	public void setAeropuertoOrigen(String aeropuertoOrigen) {
		this.aeropuertoOrigen = aeropuertoOrigen;
	}

	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public String getDivisionOrigen() {
		return divisionOrigen;
	}

	public void setDivisionOrigen(String divisionOrigen) {
		this.divisionOrigen = divisionOrigen;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public Date getFechaOrigen() {
		return fechaOrigen;
	}

	public void setFechaOrigen(Date fechaOrigen) {
		this.fechaOrigen = fechaOrigen;
	}

	public String getHoraOrigen() {
		return horaOrigen;
	}

	public void setHoraOrigen(String horaOrigen) {
		this.horaOrigen = horaOrigen;
	}

	public String getVueloDestino() {
		return vueloDestino;
	}

	public void setVueloDestino(String vueloDestino) {
		this.vueloDestino = vueloDestino;
	}

	public String getAeropuertoDestino() {
		return aeropuertoDestino;
	}

	public void setAeropuertoDestino(String aeropuertoDestino) {
		this.aeropuertoDestino = aeropuertoDestino;
	}

	public String getCiudadDestino() {
		return ciudadDestino;
	}

	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public String getDivisionDestino() {
		return divisionDestino;
	}

	public void setDivisionDestino(String divisionDestino) {
		this.divisionDestino = divisionDestino;
	}

	public String getPaisDestino() {
		return paisDestino;
	}

	public void setPaisDestino(String paisDestino) {
		this.paisDestino = paisDestino;
	}

	public Date getFechaDestino() {
		return fechaDestino;
	}

	public void setFechaDestino(Date fechaDestino) {
		this.fechaDestino = fechaDestino;
	}

	public String getHoraDestino() {
		return horaDestino;
	}

	public void setHoraDestino(String horaDestino) {
		this.horaDestino = horaDestino;
	}
	
	
	
}
