package com.colegio.sistemaCRJ.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colegio.sistemaCRJ.entity.Grado;

//@Repository
public interface GradoRepository extends JpaRepository<Grado, Long> {
	//Optional<Grado> findByNombreGrado(String ng);
}
