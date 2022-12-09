package com.vuelos.vuelosrestAPI.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
class PilotAssignmentPK implements Serializable{
	
	private String PILOTASSIGNMENT_AIRLINECODE_PK;
	private String PA_FLIGHTNUMBER_PK;
	private String AIRPORTCODE_PK;
	private String PA_PILOTLICENSE_PK;
	
	public PilotAssignmentPK() {
		
	}

	public PilotAssignmentPK(String pILOTASSIGNMENT_AIRLINECODE_PK, String pA_FLIGHTNUMBER_PK, String aIRPORTCODE_PK,
			String pA_PILOTLICENSE_PK) {
		super();
		PILOTASSIGNMENT_AIRLINECODE_PK = pILOTASSIGNMENT_AIRLINECODE_PK;
		PA_FLIGHTNUMBER_PK = pA_FLIGHTNUMBER_PK;
		AIRPORTCODE_PK = aIRPORTCODE_PK;
		PA_PILOTLICENSE_PK = pA_PILOTLICENSE_PK;
	}

	public String getPILOTASSIGNMENT_AIRLINECODE_PK() {
		return PILOTASSIGNMENT_AIRLINECODE_PK;
	}

	public void setPILOTASSIGNMENT_AIRLINECODE_PK(String pILOTASSIGNMENT_AIRLINECODE_PK) {
		PILOTASSIGNMENT_AIRLINECODE_PK = pILOTASSIGNMENT_AIRLINECODE_PK;
	}

	public String getPA_FLIGHTNUMBER_PK() {
		return PA_FLIGHTNUMBER_PK;
	}

	public void setPA_FLIGHTNUMBER_PK(String pA_FLIGHTNUMBER_PK) {
		PA_FLIGHTNUMBER_PK = pA_FLIGHTNUMBER_PK;
	}

	public String getAIRPORTCODE_PK() {
		return AIRPORTCODE_PK;
	}

	public void setAIRPORTCODE_PK(String aIRPORTCODE_PK) {
		AIRPORTCODE_PK = aIRPORTCODE_PK;
	}

	public String getPA_PILOTLICENSE_PK() {
		return PA_PILOTLICENSE_PK;
	}

	public void setPA_PILOTLICENSE_PK(String pA_PILOTLICENSE_PK) {
		PA_PILOTLICENSE_PK = pA_PILOTLICENSE_PK;
	}
	
	
	
}
