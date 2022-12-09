package com.vuelos.vuelosrestAPI.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "FLIGHTSEGMENT")
public class FlightSegment {
	
	@EmbeddedId
	private FlightSegmentPK flighSegmentPK;
	
	/*
	@Id
	@Column (name = "FLIGHTSEGMENT_AIRLINECODE_PK")
	private String airlinecode_PK;
	@Id
	@Column (name = "FLIGHTSEGMENT_FLIGHTNUMBER_PK")
	private String flightnumber_PK;
	@Id
	@Column (name = "FLIGHTSEGMENT_AIRPORTCODE_PK")
	private String origen_airportcode_FK;
	*/
	@Column (name = "FS_AIR_AIRPORTCODE_PK")
	private String destino_airportcode_FK;
	@Column (name = "FLIGHTSEGMENT_FECHAVUELO", nullable = true)
	private Date fechaVuelo;
	@Column (name = "FLIGHTSEGMENT_DURACION")
	private Integer duracionSegmento;
	
	public FlightSegment () {
		
	}

	public FlightSegment(FlightSegmentPK flighSegmentPK, String destino_airportcode_FK, Date fechaVuelo,
			Integer duracionSegmento) {
		super();
		this.flighSegmentPK = flighSegmentPK;
		this.destino_airportcode_FK = destino_airportcode_FK;
		this.fechaVuelo = fechaVuelo;
		this.duracionSegmento = duracionSegmento;
	}

	public FlightSegmentPK getFlighSegmentPK() {
		return flighSegmentPK;
	}

	public void setFlighSegmentPK(FlightSegmentPK flighSegmentPK) {
		this.flighSegmentPK = flighSegmentPK;
	}

	public String getDestino_airportcode_FK() {
		return destino_airportcode_FK;
	}

	public void setDestino_airportcode_FK(String destino_airportcode_FK) {
		this.destino_airportcode_FK = destino_airportcode_FK;
	}

	public Date getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(Date fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public Integer getDuracionSegmento() {
		return duracionSegmento;
	}

	public void setDuracionSegmento(Integer duracionSegmento) {
		this.duracionSegmento = duracionSegmento;
	}

	
	
	
}
