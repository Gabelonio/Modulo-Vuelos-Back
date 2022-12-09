package com.vuelos.vuelosrestAPI.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "PILOTASSIGNMENT")
public class PilotAssignment {

	@EmbeddedId
	private PilotAssignmentPK pilotAssignmetPK;
	
	public PilotAssignment () {
		
	}

	public PilotAssignment(PilotAssignmentPK pilotAssignmetPK) {
		super();
		this.pilotAssignmetPK = pilotAssignmetPK;
	}

	public PilotAssignmentPK getPilotAssignmetPK() {
		return pilotAssignmetPK;
	}

	public void setPilotAssignmetPK(PilotAssignmentPK pilotAssignmetPK) {
		this.pilotAssignmetPK = pilotAssignmetPK;
	}
	
	
	
}
