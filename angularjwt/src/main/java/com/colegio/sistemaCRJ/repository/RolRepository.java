package com.colegio.sistemaCRJ.repository;

import com.colegio.sistemaCRJ.entity.Rol;
import com.colegio.sistemaCRJ.enums.RolNombre;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}