package com.colegio.sistemaCRJ.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colegio.sistemaCRJ.entity.Asignacion;


//@Repository
public interface AsignacionRepository extends JpaRepository<Asignacion, Long> {
	//Optional<Asignacion> findByNombreAsignacion(String na);
}
