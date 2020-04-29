package com.colegio.sistemaCRJ.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="frecuencia")
public class Frecuencia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_frecuencia;
	
	@NotNull
	private String nombre;
	
	public Frecuencia() {
		
	}

	public Frecuencia(Long id, @NotNull String nombre) {
		super();
		this.id_frecuencia = id;
		this.nombre = nombre;
	}

	public Long getId() {
		return id_frecuencia;
	}

	public void setId(Long id) {
		this.id_frecuencia = id;
	}

	public String getAño() {
		return nombre;
	}

	public void setAño(String nombre) {
		this.nombre = nombre;
	}
	
	
}
