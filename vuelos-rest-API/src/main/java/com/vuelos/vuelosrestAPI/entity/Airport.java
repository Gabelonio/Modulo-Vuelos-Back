package com.vuelos.vuelosrestAPI.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//PARA UNA PROXIMA OCASION, ESTO SE ESCRIBE DE PRIMERO

@Getter
@Setter
@Entity
@Table(name = "AIRPORT")
public class Airport {
	
	@Id
	@Column(name = "AIRPORT_AIRPORTCODE_PK")
	private String airport_AirportCode_PK;
	
	@Column(name = "AIRPORT_IDPLACE_PK")
	private String place_IdPlace_FK;
	
	@Column(name = "AIRPORT_AIRPORTYPE_PK")
	private String airporttype_AirportType_FK;
	
	@Column(name = "AIRPORTNAME")
	private String airport_AirportName;
	
	public Airport() {
		
	}

	public Airport(String airport_AirportCode_PK, String place_IdPlace_FK, String airporttype_AirportType_FK, String airport_AirportName) {
		super();
		this.airport_AirportCode_PK = airport_AirportCode_PK;
		this.place_IdPlace_FK = place_IdPlace_FK;
		this.airporttype_AirportType_FK = airporttype_AirportType_FK;
		this.airport_AirportName = airport_AirportName;
	}

	public String getAirport_AirportCode_PK() {
		return airport_AirportCode_PK;
	}

	public void setAirport_AirportCode_PK(String airport_AirportCode_PK) {
		this.airport_AirportCode_PK = airport_AirportCode_PK;
	}

	public String getPlace_IdPlace_FK() {
		return place_IdPlace_FK;
	}

	public void setPlace_IdPlace_FK(String place_IdPlace_FK) {
		this.place_IdPlace_FK = place_IdPlace_FK;
	}

	public String getAirporttype_AirportType_FK() {
		return airporttype_AirportType_FK;
	}

	public void setAirporttype_AirportType_FK(String airporttype_AirportType_FK) {
		this.airporttype_AirportType_FK = airporttype_AirportType_FK;
	}

	public String getAirport_AirportName() {
		return airport_AirportName;
	}

	public void setAirport_AirportName(String airport_AirportName) {
		this.airport_AirportName = airport_AirportName;
	}
	
	
	
}