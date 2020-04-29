package com.colegio.sistemaCRJ.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colegio.sistemaCRJ.entity.Matricula;


//@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long>{
	//Optional<Matricula> findByNombreMatricula(String nm);
}
