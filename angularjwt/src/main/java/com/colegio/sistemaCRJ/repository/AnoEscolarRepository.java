package com.colegio.sistemaCRJ.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colegio.sistemaCRJ.entity.AnoEscolar;
//@Repository
public interface AnoEscolarRepository extends JpaRepository<AnoEscolar, Long> {
	//Optional<AnoEscolar> findByNombreAnoEscolar(String nae);
	public Optional<AnoEscolar> findById(Long id);
}
