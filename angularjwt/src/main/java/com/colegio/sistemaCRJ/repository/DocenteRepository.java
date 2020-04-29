package com.colegio.sistemaCRJ.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colegio.sistemaCRJ.entity.Docente;


//@Repository
public interface DocenteRepository extends JpaRepository<Docente, Long> {
	//Optional<Docente> findByNombreDocente(String nd);
}
