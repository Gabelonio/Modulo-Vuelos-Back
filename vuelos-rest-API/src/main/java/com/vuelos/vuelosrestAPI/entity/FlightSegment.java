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
@IdClass(FlightSegmentLlaveCompuesta.class)
public class FlightSegment {
	
	@Id
	@Column (name = "FLIGHTSEGMENT_AIRLINECODE_PK")
	private String flightsegmentAirlinecodePk;
	@Id
	@Column (name = "FLIGHTSEGMENT_FLIGHTNUMBER_PK")
	private String flightsegmentFlightnumberPk;
	@Id
	@Column (name = "FLIGHTSEGMENT_AIRPORTCODE_PK")
	private String flightsegmentAirportcodePk;
	
	@Column (name = "FS_AIR_AIRPORTCODE_PK")
	private String fsAirAirportcodePk;
	@Column (name = "FLIGHTSEGMENT_FECHAVUELO", nullable = true)
	private Date flightsegmentFechavuelo;
	@Column (name = "FLIGHTSEGMENT_DURACION")
	private Integer flightsegmentDuracion;
	
	public FlightSegment () {
		
	}

	public FlightSegment(String flightsegmentAirlinecodePk, String flightsegmentFlightnumberPk,
			String flightsegmentAirportcodePk, String fsAirAirportcodePk, Date flightsegmentFechavuelo,
			Integer flightsegmentDuracion) {
		super();
		this.flightsegmentAirlinecodePk = flightsegmentAirlinecodePk;
		this.flightsegmentFlightnumberPk = flightsegmentFlightnumberPk;
		this.flightsegmentAirportcodePk = flightsegmentAirportcodePk;
		this.fsAirAirportcodePk = fsAirAirportcodePk;
		this.flightsegmentFechavuelo = flightsegmentFechavuelo;
		this.flightsegmentDuracion = flightsegmentDuracion;
	}

	public String getFlightsegmentAirlinecodePk() {
		return flightsegmentAirlinecodePk;
	}

	public void setFlightsegmentAirlinecodePk(String flightsegmentAirlinecodePk) {
		this.flightsegmentAirlinecodePk = flightsegmentAirlinecodePk;
	}

	public String getFlightsegmentFlightnumberPk() {
		return flightsegmentFlightnumberPk;
	}

	public void setFlightsegmentFlightnumberPk(String flightsegmentFlightnumberPk) {
		this.flightsegmentFlightnumberPk = flightsegmentFlightnumberPk;
	}

	public String getFlightsegmentAirportcodePk() {
		return flightsegmentAirportcodePk;
	}

	public void setFlightsegmentAirportcodePk(String flightsegmentAirportcodePk) {
		this.flightsegmentAirportcodePk = flightsegmentAirportcodePk;
	}

	public String getFsAirAirportcodePk() {
		return fsAirAirportcodePk;
	}

	public void setFsAirAirportcodePk(String fsAirAirportcodePk) {
		this.fsAirAirportcodePk = fsAirAirportcodePk;
	}

	public Date getFlightsegmentFechavuelo() {
		return flightsegmentFechavuelo;
	}

	public void setFlightsegmentFechavuelo(Date flightsegmentFechavuelo) {
		this.flightsegmentFechavuelo = flightsegmentFechavuelo;
	}

	public Integer getFlightsegmentDuracion() {
		return flightsegmentDuracion;
	}

	public void setFlightsegmentDuracion(Integer flightsegmentDuracion) {
		this.flightsegmentDuracion = flightsegmentDuracion;
	}


	
/*
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
	}*/

	
	
	
}
