package com.vuelos.vuelosrestAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vuelos.vuelosrestAPI.entity.Place;
import com.vuelos.vuelosrestAPI.entity.PlaceLlaveCompuesta;

public interface PlaceRepository extends JpaRepository <Place, PlaceLlaveCompuesta> {
	
	@Query (value = "SELECT * FROM PLACE", nativeQuery = true)
	List<Place> getLugares();
	
	@Query (value = "SELECT P.PLACENAME"
			+" FROM PLACE P, AIRPORT A"
			+" WHERE A.airport_idplace_pk = P.place_idplace_pk AND A.airport_airportcode_pk = :idPlace"
			,nativeQuery = true)
	List<String> getNomPlaceFromAeropuerto (String idPlace);
	
	@Query (value = "SELECT P.PLACENAME"
			+" FROM PLACE PC, PLACE P"
			+" WHERE PC.PLA_IDPLACE_PK = P.place_idplace_pk AND PC.place_idplace_pk = :idPlace"
			,nativeQuery = true)
	List<String> getNomPlaceDFromPlaceC (String idPlace);
	
	@Query (value = "SELECT P.PLACE_DESPLACETYPE_PK"
			+" FROM PLACE PC, PLACE P"
			+" WHERE PC.PLA_IDPLACE_PK = P.place_idplace_pk AND PC.place_idplace_pk = :idPlace"
			,nativeQuery = true)
	List<String> getTypePlaceDFromPlaceC (String idPlace);
	
	@Query (value = "SELECT P.PLACENAME"
			+" FROM PLACE PC, PLACE PD, PLACE P"
			+" WHERE PC.PLA_IDPLACE_PK = PD.place_idplace_pk AND PD.PLA_IDPLACE_PK = P.place_idplace_pk AND PC.place_idplace_pk = :idPlace"
			,nativeQuery = true)
	List<String> getNomPlacePFromPlaceC (String idPlace);
}
