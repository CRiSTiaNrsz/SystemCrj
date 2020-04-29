package com.colegio.sistemaCRJ.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="nivel")
public class Nivel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_nivel;
	
	@NotNull
	@Column(unique=true)
	private String nombre;
	
	public Nivel() {
		
	}
	
	
	public Nivel(Long id, String nombre) {
		this.id_nivel = id;
		this.nombre = nombre;
	}

	public Long getId() {
		return id_nivel;
	}

	public void setId(Long id) {
		this.id_nivel = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getId_nivel() {
		return id_nivel;
	}

	public void setId_nivel(Long id_nivel) {
		this.id_nivel = id_nivel;
	}

}
