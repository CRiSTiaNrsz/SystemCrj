package com.colegio.sistemaCRJ.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colegio.sistemaCRJ.entity.Alumno;

//@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
	Optional<Alumno> findByNombre(String na);
}
