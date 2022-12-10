package com.vuelos.vuelosrestAPI.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "PILOTASSIGNMENT")
@IdClass(PilotAssignmentLlaveCompuesta.class)
public class PilotAssignment {
	
	@Id
	@Column (name = "PILOTASSIGNMENT_AIRLINECODE_PK")
	private String pilotAssignmentAirlinecodePk;
	@Id
	@Column (name = "PA_FLIGHTNUMBER_PK")
	private String paFlightnumberPk;
	@Id
	@Column (name = "AIRPORTCODE_PK")
	private String airportcodePk;
	@Id
	@Column (name = "PA_PILOTLICENSE_PK")
	private String paPilotlicensePk;

	
	public PilotAssignment () {
		
	}
	
	public PilotAssignment(String pilotAssignmentAirlinecodePk, String paFlightnumberPk, String airportcodePk,
			String paPilotlicensePk) {
		super();
		this.pilotAssignmentAirlinecodePk = pilotAssignmentAirlinecodePk;
		this.paFlightnumberPk = paFlightnumberPk;
		this.airportcodePk = airportcodePk;
		this.paPilotlicensePk = paPilotlicensePk;
	}
	

	public String getPilotAssignmentAirlinecodePk() {
		return pilotAssignmentAirlinecodePk;
	}


	public void setPilotAssignmentAirlinecodePk(String pilotAssignmentAirlinecodePk) {
		this.pilotAssignmentAirlinecodePk = pilotAssignmentAirlinecodePk;
	}


	public String getPaFlightnumberPk() {
		return paFlightnumberPk;
	}


	public void setPaFlightnumberPk(String paFlightnumberPk) {
		this.paFlightnumberPk = paFlightnumberPk;
	}


	public String getAirportcodePk() {
		return airportcodePk;
	}


	public void setAirportcodePk(String airportcodePk) {
		this.airportcodePk = airportcodePk;
	}


	public String getPaPilotlicensePk() {
		return paPilotlicensePk;
	}


	public void setPaPilotlicensePk(String paPilotlicensePk) {
		this.paPilotlicensePk = paPilotlicensePk;
	}
	
}
