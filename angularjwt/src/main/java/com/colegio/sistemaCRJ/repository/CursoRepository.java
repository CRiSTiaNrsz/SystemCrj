package com.colegio.sistemaCRJ.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colegio.sistemaCRJ.entity.Curso;

//@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
	//Optional<Curso> findByNombreCurso(String nc);
}
