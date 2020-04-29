package com.colegio.sistemaCRJ.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="curso")
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_curso;
	
	@NotNull
	private String nombre;
	
	
	
	

	public Curso() {
		super();
	}

	public Curso(Long id_curso, @NotNull String nombre) {
		super();
		this.id_curso = id_curso;
		this.nombre = nombre;
	}

	public Long getId_curso() {
		return id_curso;
	}

	public void setId_curso(Long id_curso) {
		this.id_curso = id_curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	
	
	
	
}
