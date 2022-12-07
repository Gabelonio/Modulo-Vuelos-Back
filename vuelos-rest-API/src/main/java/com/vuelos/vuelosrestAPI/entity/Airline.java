package com.vuelos.vuelosrestAPI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//PARA UNA PROXIMA OCASION, ESTO SE ESCRIBE DE PRIMERO

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Airline")
public class Airline {

	@Id
    private String airlinecodePk;
	private String airAirlinecodePk;
    private String airlineIdplacePk;
	private String airlinename;
}
