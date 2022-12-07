package com.vuelos.vuelosrestAPI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Flight")
public class Flight {
	
	@Id
	private String flightAirlinecodePk;
	private String flightnumberPk;
}