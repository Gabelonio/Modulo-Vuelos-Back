package com.vuelos.vuelosrestAPI.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Table;

@Getter
@Setter

@Entity
@Table(name = "PILOT")
public class Pilot {
	
	@Id
	@Column(name = "PILOTLICENSE_PK")
	private String pilotlicensePk;
	@Column(name = "PILOTAIRLINECODE_PK")
	private String pilotairlinecodePk;
	@Column(name = "CONEXION_EMPLOYEENUMBER_PK")
	private String conexionEmployeenumberPk;
	@Column(name = "PILOTLICENSEEXPIRATION")
	private String pilotlicenseexpiration;
	
	@Column (name = "NAME")
	private String pilotName;
	
	public Pilot () {
		
	}

	public Pilot(String pilotlicensePk, String pilotairlinecodePk, String conexionEmployeenumberPk,
			String pilotlicenseexpiration, String pilotName) {
		super();
		this.pilotlicensePk = pilotlicensePk;
		this.pilotairlinecodePk = pilotairlinecodePk;
		this.conexionEmployeenumberPk = conexionEmployeenumberPk;
		this.pilotlicenseexpiration = pilotlicenseexpiration;
		this.pilotName = pilotName;
	}

	public String getPilotlicensePk() {
		return pilotlicensePk;
	}

	public void setPilotlicensePk(String pilotlicensePk) {
		this.pilotlicensePk = pilotlicensePk;
	}

	public String getPilotairlinecodePk() {
		return pilotairlinecodePk;
	}

	public void setPilotairlinecodePk(String pilotairlinecodePk) {
		this.pilotairlinecodePk = pilotairlinecodePk;
	}

	public String getConexionEmployeenumberPk() {
		return conexionEmployeenumberPk;
	}

	public void setConexionEmployeenumberPk(String conexionEmployeenumberPk) {
		this.conexionEmployeenumberPk = conexionEmployeenumberPk;
	}

	public String getPilotlicenseexpiration() {
		return pilotlicenseexpiration;
	}

	public void setPilotlicenseexpiration(String pilotlicenseexpiration) {
		this.pilotlicenseexpiration = pilotlicenseexpiration;
	}

	public String getPilotName() {
		return pilotName;
	}

	public void setPilotName(String pilotName) {
		this.pilotName = pilotName;
	}
	
	
	
}
