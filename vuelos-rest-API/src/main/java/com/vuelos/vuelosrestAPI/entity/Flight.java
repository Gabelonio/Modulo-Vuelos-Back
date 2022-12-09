package com.vuelos.vuelosrestAPI.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "FLIGHT")
public class Flight {
	
	@Id
	@Column (name = "FLIGHT_AIRLINECODE_PK")
	private String flightAirlinecodePk;
	@Column (name = "FLIGHTNUMBER_PK")
	private String flightnumberPk;
	
	
	public Flight() {
		
	}


	public Flight(String flightAirlinecodePk, String flightnumberPk) {
		super();
		this.flightAirlinecodePk = flightAirlinecodePk;
		this.flightnumberPk = flightnumberPk;
	}


	public String getFlightAirlinecodePk() {
		return flightAirlinecodePk;
	}


	public void setFlightAirlinecodePk(String flightAirlinecodePk) {
		this.flightAirlinecodePk = flightAirlinecodePk;
	}


	public String getFlightnumberPk() {
		return flightnumberPk;
	}


	public void setFlightnumberPk(String flightnumberPk) {
		this.flightnumberPk = flightnumberPk;
	}
	
	
	
}
