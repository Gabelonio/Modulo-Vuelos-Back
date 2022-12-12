package com.vuelos.vuelosrestAPI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@IdClass(CuadroInformativoLlaveCompuesta.class)
public class CuadroInformativo {
	
	@Id
	private String numero_vuelo;
	
	@Id
	private String aerolinea_vuelo;
	private String nombre_aerolinea;
	private String nombre_aeropuerto;
	private String ciudad_aeropuerto;
	private String descripcion_division_aeropuerto;
	private String nombre_division_aeropuerto;
	private String nombre_pais_aeropuerto;
	private String fecha_vuelo;
	private String duracion_vuelo;
	private String nombre_piloto;

	public CuadroInformativo() {}

	public CuadroInformativo(String aerolinea_vuelo, String numero_vuelo, String nombre_aerolinea, String nombre_aeropuerto,
			String ciudad_aeropuerto, String descripcion_division_aeropuerto, String nombre_division_aeropuerto,
			String nombre_pais_aeropuerto, String fecha_vuelo, String duracion_vuelo, String nombre_piloto) {
		super();
		this.aerolinea_vuelo = aerolinea_vuelo;
		this.numero_vuelo = numero_vuelo;
		this.nombre_aerolinea = nombre_aerolinea;
		this.nombre_aeropuerto = nombre_aeropuerto;
		this.ciudad_aeropuerto = ciudad_aeropuerto;
		this.descripcion_division_aeropuerto = descripcion_division_aeropuerto;
		this.nombre_division_aeropuerto = nombre_division_aeropuerto;
		this.nombre_pais_aeropuerto = nombre_pais_aeropuerto;
		this.fecha_vuelo = fecha_vuelo;
		this.duracion_vuelo = duracion_vuelo;
		this.nombre_piloto = nombre_piloto;
	}

	public String getaerolinea_vuelo() {
		return aerolinea_vuelo;
	}

	public void setaerolinea_vuelo(String aerolinea_vuelo) {
		this.aerolinea_vuelo = aerolinea_vuelo;
	}

	public String getnumero_vuelo() {
		return numero_vuelo;
	}

	public void setnumero_vuelo(String numero_vuelo) {
		this.numero_vuelo = numero_vuelo;
	}

	public String getnombre_aerolinea() {
		return nombre_aerolinea;
	}

	public void setnombre_aerolinea(String nombre_aerolinea) {
		this.nombre_aerolinea = nombre_aerolinea;
	}

	public String getnombre_aeropuerto() {
		return nombre_aeropuerto;
	}
	public void setnombre_aeropuerto(String nombre_aeropuerto) {
		this.nombre_aeropuerto = nombre_aeropuerto;
	}

	public String getciudad_aeropuerto() {
		return ciudad_aeropuerto;
	}
	public void setciudad_aeropuerto(String ciudad_aeropuerto) {
		this.ciudad_aeropuerto = ciudad_aeropuerto;
	}

	public String getdescripcion_division_aeropuerto() {
		return descripcion_division_aeropuerto;
	} 
	public void setdescripcion_division_aeropuerto(String descripcion_division_aeropuerto) {
		this.descripcion_division_aeropuerto = descripcion_division_aeropuerto;
	}

	public String getnombre_division_aeropuerto() {
		return nombre_division_aeropuerto;
	}
	public void setnombre_division_aeropuerto(String nombre_division_aeropuerto) {
		this.nombre_division_aeropuerto = nombre_division_aeropuerto;
	}

	public String getnombre_pais_aeropuerto() {
		return nombre_pais_aeropuerto;
	}
	public void setnombre_pais_aeropuerto(String nombre_pais_aeropuerto) {
		this.nombre_pais_aeropuerto = nombre_pais_aeropuerto;
	}

	public String getfecha_vuelo() {
		return fecha_vuelo;
	}
	public void setfecha_vuelo(String fecha_vuelo) {
		this.fecha_vuelo = fecha_vuelo;
	}

	public String getduracion_vuelo() {
		return duracion_vuelo;
	}
	public void setduracion_vuelo(String duracion_vuelo) {
		this.duracion_vuelo = duracion_vuelo;
	}

	public String getnombre_piloto() {
		return nombre_piloto;
	}
	public void setnombre_piloto(String nombre_piloto) {
		this.nombre_piloto = nombre_piloto;
	}
	
}
/*
@Id
private String FLIGHTSEGMENT_FLIGHTNUMBER_PK;

private String FLIGHTSEGMENT_AIRLINECODE_PK;
private String AIRLINENAME;
private String AIRPORTNAME;
private String PLACENAME;
private String PLACE_DESPLACETYPE_PK;
private String nombre_division_aeropuerto;
private String nombre_pais_aeropuerto;
private String FLIGHTSEGMENT_FECHAVUELO;
private String FLIGHTSEGMENT_DURACION;
private String NAME;

public CuadroInformativo() {}

public CuadroInformativo(String FLIGHTSEGMENT_AIRLINECODE_PK, String FLIGHTSEGMENT_FLIGHTNUMBER_PK, String AIRLINENAME, String AIRPORTNAME,
		String PLACENAME, String PLACE_DESPLACETYPE_PK, String nombre_division_aeropuerto,
		String nombre_pais_aeropuerto, String FLIGHTSEGMENT_FECHAVUELO, String FLIGHTSEGMENT_DURACION, String NAME) {
	super();
	this.FLIGHTSEGMENT_AIRLINECODE_PK = FLIGHTSEGMENT_AIRLINECODE_PK;
	this.FLIGHTSEGMENT_FLIGHTNUMBER_PK = FLIGHTSEGMENT_FLIGHTNUMBER_PK;
	this.AIRLINENAME = AIRLINENAME;
	this.AIRPORTNAME = AIRPORTNAME;
	this.PLACENAME = PLACENAME;
	this.PLACE_DESPLACETYPE_PK = PLACE_DESPLACETYPE_PK;
	this.nombre_division_aeropuerto = nombre_division_aeropuerto;
	this.nombre_pais_aeropuerto = nombre_pais_aeropuerto;
	this.FLIGHTSEGMENT_FECHAVUELO = FLIGHTSEGMENT_FECHAVUELO;
	this.FLIGHTSEGMENT_DURACION = FLIGHTSEGMENT_DURACION;
	this.NAME = NAME;
}

public String getFLIGHTSEGMENT_AIRLINECODE_PK() {
	return FLIGHTSEGMENT_AIRLINECODE_PK;
}

public void setFLIGHTSEGMENT_AIRLINECODE_PK(String FLIGHTSEGMENT_AIRLINECODE_PK) {
	this.FLIGHTSEGMENT_AIRLINECODE_PK = FLIGHTSEGMENT_AIRLINECODE_PK;
}

public String getFLIGHTSEGMENT_FLIGHTNUMBER_PK() {
	return FLIGHTSEGMENT_FLIGHTNUMBER_PK;
}

public void setFLIGHTSEGMENT_FLIGHTNUMBER_PK(String FLIGHTSEGMENT_FLIGHTNUMBER_PK) {
	this.FLIGHTSEGMENT_FLIGHTNUMBER_PK = FLIGHTSEGMENT_FLIGHTNUMBER_PK;
}

public String getAIRLINENAME() {
	return AIRLINENAME;
}

public void setAIRLINENAME(String AIRLINENAME) {
	this.AIRLINENAME = AIRLINENAME;
}

public String getAIRPORTNAME() {
	return AIRPORTNAME;
}
public void setAIRPORTNAME(String AIRPORTNAME) {
	this.AIRPORTNAME = AIRPORTNAME;
}

public String getPLACENAME() {
	return PLACENAME;
}
public void setPLACENAME(String PLACENAME) {
	this.PLACENAME = PLACENAME;
}

public String getPLACE_DESPLACETYPE_PK() {
	return PLACE_DESPLACETYPE_PK;
} 
public void setPLACE_DESPLACETYPE_PK(String PLACE_DESPLACETYPE_PK) {
	this.PLACE_DESPLACETYPE_PK = PLACE_DESPLACETYPE_PK;
}

public String getnombre_division_aeropuerto() {
	return nombre_division_aeropuerto;
}
public void setnombre_division_aeropuerto(String nombre_division_aeropuerto) {
	this.nombre_division_aeropuerto = nombre_division_aeropuerto;
}

public String getnombre_pais_aeropuerto() {
	return nombre_pais_aeropuerto;
}
public void setnombre_pais_aeropuerto(String nombre_pais_aeropuerto) {
	this.nombre_pais_aeropuerto = nombre_pais_aeropuerto;
}

public String getFLIGHTSEGMENT_FECHAVUELO() {
	return FLIGHTSEGMENT_FECHAVUELO;
}
public void setFLIGHTSEGMENT_FECHAVUELO(String FLIGHTSEGMENT_FECHAVUELO) {
	this.FLIGHTSEGMENT_FECHAVUELO = FLIGHTSEGMENT_FECHAVUELO;
}

public String getFLIGHTSEGMENT_DURACION() {
	return FLIGHTSEGMENT_DURACION;
}
public void setFLIGHTSEGMENT_DURACION(String FLIGHTSEGMENT_DURACION) {
	this.FLIGHTSEGMENT_DURACION = FLIGHTSEGMENT_DURACION;
}

public String getNAME() {
	return NAME;
}
public void setNAME(String NAME) {
	this.NAME = NAME;
}*/