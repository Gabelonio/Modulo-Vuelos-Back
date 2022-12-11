package com.vuelos.vuelosrestAPI.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vuelos.vuelosrestAPI.entity.Airline;
import com.vuelos.vuelosrestAPI.entity.Airport;
import com.vuelos.vuelosrestAPI.entity.Conexion;
import com.vuelos.vuelosrestAPI.entity.Flight;
import com.vuelos.vuelosrestAPI.entity.FlightSegment;
import com.vuelos.vuelosrestAPI.entity.Itinerario;
import com.vuelos.vuelosrestAPI.entity.Place;
import com.vuelos.vuelosrestAPI.entity.SegmentoItinerario;
import com.vuelos.vuelosrestAPI.repository.AirlineRepository;
import com.vuelos.vuelosrestAPI.repository.AirportRepository;
import com.vuelos.vuelosrestAPI.repository.ConexionRepository;
import com.vuelos.vuelosrestAPI.repository.FlightRepository;
import com.vuelos.vuelosrestAPI.repository.FlightSegmentRepository;
import com.vuelos.vuelosrestAPI.repository.PlaceRepository;

@RestController
@RequestMapping("api/v1/itinerario")
@CrossOrigin(origins = "*")
public class ItinerarioController {

	@Autowired
	private AirlineRepository repositorioAerolinea;
	List<Airline> aerolineas;
	@Autowired
	private FlightRepository repositorioVuelo;
	List<Flight> vuelos;
	@Autowired
	private FlightSegmentRepository repositorioSegmentosDeVuelo;
	List<FlightSegment> segmentosDeVuelos;
	List<FlightSegment> segmentosDeVuelo;
	@Autowired
	private ConexionRepository repositorioConexion;
	List<Conexion> conexiones;
	@Autowired
	private AirportRepository repositorioAeropuerto;
	List<Airport> aeropuertos;
	@Autowired
	private PlaceRepository repositorioPlace;
	List<Place> lugares;
	
	private List<Itinerario> itinerarios = new ArrayList<Itinerario>();
	List<SegmentoItinerario> itinerario = new ArrayList<SegmentoItinerario>();
	SegmentoItinerario segmento;
	
	@GetMapping ("/getItinerarios")
	public List<Itinerario> getItinerarios(@RequestParam("aeropuertoOrigen")String aeropuertoOrigen, @RequestParam("aeropuertoDestino")String aeropuertoDestino, @RequestParam("fechaOrigen") Date fechaOrigen){
		
		itinerarios.clear();
		itinerario.clear();
		
		initRepositorios();

		
		//Ir llenando itinerarios, primero por vuelos directos, y después mediante por conexiones si hay.
		llenarItineraVuelosDirectos(aeropuertoOrigen, aeropuertoDestino, fechaOrigen);
		return itinerarios;
	}
	
	/*
	//Para testear con el backend
	@GetMapping ("/getItinerarios/{aeropuertoOrigen}/{aeropuertoDestino}/{fechaOrigen}")
	public List<Itinerario> getItinerarios(@PathVariable String aeropuertoOrigen,@PathVariable String aeropuertoDestino,@PathVariable String fechaOrigen){
		itinerarios.clear();
		itinerario.clear();
		
		initRepositorios();

		
		//Ir llenando itinerarios, primero por vuelos directos, y después mediante por conexiones si hay.
		llenarItineraVuelosDirectos(aeropuertoOrigen, aeropuertoDestino, fechaOrigen);
		return itinerarios;
	}
	*/
	private void llenarItineraVuelosDirectos(String aeropuertoOrigen, String aeropuertoDestino, Date fechaOrigen) {
		
		for (int v = 0; v < vuelos.size();v++) {
			int contador = 0;
			segmentosDeVuelo = repositorioSegmentosDeVuelo.getSegmentosVuelo( vuelos.get(v).getFlightAirlinecodePk(), vuelos.get(v).getFlightnumberPk());
			for (int i = 0; i < segmentosDeVuelo.size();i++) {
				if (segmentosDeVuelo.get(i).getFlightsegmentAirportcodePk().equals(aeropuertoOrigen)) {
					
					for(int f = contador; f < segmentosDeVuelo.size();f++) {
						
						itinerario.add(crearSegmentoItinerario(segmentosDeVuelo.get(f)));
						
						if (contador <= f && segmentosDeVuelo.get(f).getFsAirAirportcodePk().equals(aeropuertoDestino)) {
							itinerarios.add(new Itinerario(itinerario));
						}
					}
					
					itinerario.clear();
				}
				contador++;
			}
		}
		
		/*
		int contador = 0;
		for (int i = 0; i < segmentosDeVuelos.size();i++) {
			
			if (segmentosDeVuelos.get(i).getFlightsegmentAirportcodePk().equals(aeropuertoOrigen)) {
				
				segmentosDeVuelo = repositorioSegmentosDeVuelo.getSegmentosVuelo(segmentosDeVuelos.get(i).getFlightsegmentAirlinecodePk(), segmentosDeVuelos.get(i).getFlightsegmentFlightnumberPk());
				
				for(int f = contador; f < segmentosDeVuelo.size();f++) {
					
					itinerario.add(crearSegmentoItinerario(segmentosDeVuelo.get(f)));
					
					if (contador <= f && segmentosDeVuelo.get(f).getFsAirAirportcodePk().equals(aeropuertoDestino)) {
						itinerarios.add(new Itinerario(itinerario));
					}
				}
				itinerario.clear();
				contador = 0;
			}
			contador++;
		}
		*/
	}

	private SegmentoItinerario crearSegmentoItinerario(FlightSegment segVuelo) {
		
		segmento = new SegmentoItinerario();
		String idAeropuerto = segVuelo.getFlightsegmentAirportcodePk();
		String idPlace = repositorioAeropuerto.getIdPlaceFromIdAeropuerto(idAeropuerto)+"";
		segmento.setVueloOrigen("Vuelo: "+segVuelo.getFlightsegmentAirlinecodePk()+segVuelo.getFlightsegmentFlightnumberPk());
		segmento.setAeropuertoOrigen("Aeropuerto: "+ repositorioAeropuerto.getNomAeropuertoFromIdAeropuerto(idAeropuerto));		
		segmento.setCiudadOrigen("Ciudad: "+repositorioPlace.getNomPlaceFromAeropuerto(idPlace));
		segmento.setDivisionOrigen(repositorioPlace.getTypePlaceDFromPlaceC(idPlace)+": "+repositorioPlace.getNomPlaceDFromPlaceC(idPlace));
		segmento.setPaisOrigen("Pais: "+repositorioPlace.getNomPlacePFromPlaceC(idPlace));
		segmento.setFechaOrigen(segVuelo.getFlightsegmentFechavuelo());
		segmento.setHoraOrigen("Hora: "+segVuelo.getFlightsegmentDuracion());
		
		idAeropuerto = segVuelo.getFsAirAirportcodePk();
		idPlace = repositorioAeropuerto.getIdPlaceFromIdAeropuerto(idAeropuerto)+"";
		segmento.setVueloDestino("Vuelo: "+segVuelo.getFlightsegmentAirlinecodePk()+segVuelo.getFlightsegmentFlightnumberPk());
		segmento.setAeropuertoDestino("Aeropuerto: "+ repositorioAeropuerto.getNomAeropuertoFromIdAeropuerto(idAeropuerto));		
		segmento.setCiudadDestino("Ciudad: "+repositorioPlace.getNomPlaceFromAeropuerto(idPlace));
		segmento.setDivisionDestino(repositorioPlace.getTypePlaceDFromPlaceC(idPlace)+": "+repositorioPlace.getNomPlaceDFromPlaceC(idPlace));
		segmento.setPaisDestino("Pais: "+repositorioPlace.getNomPlacePFromPlaceC(idPlace));
		segmento.setFechaDestino(segVuelo.getFlightsegmentFechavuelo());
		segmento.setHoraDestino("Hora: "+segVuelo.getFlightsegmentDuracion());
		return segmento;
	}

	private void initRepositorios() {
		
		aerolineas = repositorioAerolinea.getAerolineas();
		vuelos = repositorioVuelo.getVuelos();
		segmentosDeVuelos = repositorioSegmentosDeVuelo.getSegmentosVuelos();
		conexiones = repositorioConexion.getConexiones();
		aeropuertos = repositorioAeropuerto.getAeropuertos();
		lugares = repositorioPlace.getLugares();
	}

}
