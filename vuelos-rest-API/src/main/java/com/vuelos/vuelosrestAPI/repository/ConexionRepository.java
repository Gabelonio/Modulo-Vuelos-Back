package com.vuelos.vuelosrestAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vuelos.vuelosrestAPI.entity.Conexion;
import com.vuelos.vuelosrestAPI.entity.ConexionLlaveCompuesta;

public interface ConexionRepository extends JpaRepository <Conexion, ConexionLlaveCompuesta>{
	
	@Query(value = "SELECT * FROM CONEXION", nativeQuery = true)
	List<Conexion> getConexiones();

}
