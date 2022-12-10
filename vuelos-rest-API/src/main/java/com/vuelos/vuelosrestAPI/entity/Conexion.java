package com.vuelos.vuelosrestAPI.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "CONEXION")
@IdClass(ConexionLlaveCompuesta.class)
public class Conexion {
	@Id
	@Column (name = "DESTINOCONEXION_AIRLINECODE_PK")
	private String destinoconexionAirlinecodePk;
	
	@Id
	@Column (name = "DESTCONEXION_FLIGHTNUMBER_PK")
	private String destconexionFlightnumberPk;
	
	@Id
	@Column (name = "DESTINOCONEXION_AIRPORTCODE_PK")
	private String destinoconexionAirportcodePk;
	
	@Id
	@Column (name = "ORIGENCONEXION_AIRLINECODE_PK")
	private String origenconexionAirlinecodePk;
	
	@Id
	@Column (name = "ORIGENCONEXION_FLIGHTNUMBER_PK")
	private String origenconexionFlightnumberPk;
	
	@Id
	@Column (name = "ORIGENCONEXION_AIRPORTCODE_PK")
	private String origenconexionAirportcodePk;
	
	public Conexion() {
		
	}
	
	public Conexion(String destinoconexionAirlinecodePk, String destconexionFlightnumberPk,
			String destinoconexionAirportcodePk, String origenconexionAirlinecodePk,
			String origenconexionFlightnumberPk, String origenconexionAirportcodePk) {
		super();
		this.destinoconexionAirlinecodePk = destinoconexionAirlinecodePk;
		this.destconexionFlightnumberPk = destconexionFlightnumberPk;
		this.destinoconexionAirportcodePk = destinoconexionAirportcodePk;
		this.origenconexionAirlinecodePk = origenconexionAirlinecodePk;
		this.origenconexionFlightnumberPk = origenconexionFlightnumberPk;
		this.origenconexionAirportcodePk = origenconexionAirportcodePk;
	}
	
	public String getDestinoconexionAirlinecodePk() {
		return destinoconexionAirlinecodePk;
	}

	public void setDestinoconexionAirlinecodePk(String destinoconexionAirlinecodePk) {
		this.destinoconexionAirlinecodePk = destinoconexionAirlinecodePk;
	}
	
	public String getDestconexionFlightnumberPk() {
		return destconexionFlightnumberPk;
	}

	public void setDestconexionFlightnumberPk(String destconexionFlightnumberPk) {
		this.destconexionFlightnumberPk = destconexionFlightnumberPk;
	}
	
	public String getDestinoconexionAirportcodePk() {
		return destinoconexionAirportcodePk;
	}

	public void setDestinoconexionAirportcodePk(String destinoconexionAirportcodePk) {
		this.destinoconexionAirportcodePk = destinoconexionAirportcodePk;
	}
	
	public String getOrigenconexionAirlinecodePk() {
		return origenconexionAirlinecodePk;
	}

	public void setOrigenconexionAirlinecodePk(String origenconexionAirlinecodePk) {
		this.origenconexionAirlinecodePk = origenconexionAirlinecodePk;
	}
	
	public String getOrigenconexionFlightnumberPk() {
		return origenconexionFlightnumberPk;
	}

	public void setOrigenconexionFlightnumberPk(String origenconexionFlightnumberPk) {
		this.origenconexionFlightnumberPk = origenconexionFlightnumberPk;
	}
	
	public String getOrigenconexionAirportcodePk() {
		return origenconexionAirportcodePk;
	}

	public void setOrigenconexionAirportcodePk(String origenconexionAirportcodePk) {
		this.origenconexionAirportcodePk = origenconexionAirportcodePk;
	}
	
}
