package com.vuelos.vuelosrestAPI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Pilot {
	
	@Id
	private String pilotlicensePk;
	private String pilotairlinecodePk;
	private String conexionEmployeenumberPk;
	private String pilotlicenseexpiration;
	private String pilotName;
	
}
