package com.colegio.sistemaCRJ.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.colegio.sistemaCRJ.entity.Nivel;


//@Repository
public interface NivelRepository extends JpaRepository<Nivel, Long> {
	//Optional<Nivel> findByNombreNivel(String nn);
}
