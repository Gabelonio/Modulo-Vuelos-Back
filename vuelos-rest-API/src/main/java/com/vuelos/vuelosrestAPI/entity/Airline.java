package com.vuelos.vuelosrestAPI.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//PARA UNA PROXIMA OCASION, ESTO SE ESCRIBE DE PRIMERO

@Entity
@Table(name = "Airline")
public class Airline {

	@Id
	@Column (name = "AIRLINECODE_PK")
    private String airlinecodePk;
	@Column (name = "AIR_AIRLINECODE_PK")
	private String airAirlinecodePk;
	@Column (name = "AIRLINE_IDPLACE_PK")
    private String airlineIdplacePk;
	@Column (name = "AIRLINENAME")
	private String airlinename;
	
	public Airline () {

	}

	public Airline(String airlinecodePk, String airAirlinecodePk, String airlineIdplacePk, String airlinename) {
		super();
		this.airlinecodePk = airlinecodePk;
		this.airAirlinecodePk = airAirlinecodePk;
		this.airlineIdplacePk = airlineIdplacePk;
		this.airlinename = airlinename;
	}

	public String getAirlinecodePk() {
		return airlinecodePk;
	}

	public void setAirlinecodePk(String airlinecodePk) {
		this.airlinecodePk = airlinecodePk;
	}

	public String getAirAirlinecodePk() {
		return airAirlinecodePk;
	}

	public void setAirAirlinecodePk(String airAirlinecodePk) {
		this.airAirlinecodePk = airAirlinecodePk;
	}

	public String getAirlineIdplacePk() {
		return airlineIdplacePk;
	}

	public void setAirlineIdplacePk(String airlineIdplacePk) {
		this.airlineIdplacePk = airlineIdplacePk;
	}

	public String getAirlinename() {
		return airlinename;
	}

	public void setAirlinename(String airlinename) {
		this.airlinename = airlinename;
	}
	
	
}
