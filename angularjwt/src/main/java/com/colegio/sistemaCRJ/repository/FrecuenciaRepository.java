package com.colegio.sistemaCRJ.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colegio.sistemaCRJ.entity.Frecuencia;


//@Repository
public interface FrecuenciaRepository extends JpaRepository<Frecuencia, Long> {
	//Optional<Frecuencia> findByNombreFrecuencia(String nf);
}
