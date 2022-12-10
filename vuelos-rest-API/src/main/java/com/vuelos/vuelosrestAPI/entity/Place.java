package com.vuelos.vuelosrestAPI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PLACE")
@IdClass(PlaceLlaveCompuesta.class)
public class Place {
	
	@Id
	@Column (name = "PLACE_IDPLACE_PK")
	private String idPlace_PK;
	
	@Id
	@Column (name = "PLACE_IDPLACETYPE_PK")
	private String idPlaceTypeFK_PK;
	
	@Id
	@Column (name = "PLACE_DESPLACETYPE_PK")
	private String descPlaceTypeFK_PK;
	
	@Column (name = "PLA_IDPLACE_PK")
	private String idPlaceFK;
	
	@Column (name = "PLACENAME")
	private String placeName;

	public Place () {
		
	}

	public Place(String idPlace_PK, String idPlaceTypeFK_PK, String descPlaceTypeFK_PK, String idPlaceFK,
			String placeName) {
		super();
		this.idPlace_PK = idPlace_PK;
		this.idPlaceTypeFK_PK = idPlaceTypeFK_PK;
		this.descPlaceTypeFK_PK = descPlaceTypeFK_PK;
		this.idPlaceFK = idPlaceFK;
		this.placeName = placeName;
	}

	public String getIdPlace_PK() {
		return idPlace_PK;
	}

	public void setIdPlace_PK(String idPlace_PK) {
		this.idPlace_PK = idPlace_PK;
	}

	public String getIdPlaceTypeFK_PK() {
		return idPlaceTypeFK_PK;
	}

	public void setIdPlaceTypeFK_PK(String idPlaceTypeFK_PK) {
		this.idPlaceTypeFK_PK = idPlaceTypeFK_PK;
	}

	public String getDescPlaceTypeFK_PK() {
		return descPlaceTypeFK_PK;
	}

	public void setDescPlaceTypeFK_PK(String descPlaceTypeFK_PK) {
		this.descPlaceTypeFK_PK = descPlaceTypeFK_PK;
	}

	public String getIdPlaceFK() {
		return idPlaceFK;
	}

	public void setIdPlaceFK(String idPlaceFK) {
		this.idPlaceFK = idPlaceFK;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	
	

}
