package com.colegio.sistemaCRJ.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="matricula")
public class Matricula {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_matricula;
	
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="id_alumno",referencedColumnName="id_alumno")
	private Alumno alumno;
	
	@NotNull
	private Date fecha;
	
	public Matricula() {
		
	}

	public Matricula(Long id_matricula, Alumno alumno, @NotNull Date fecha) {
		this.id_matricula = id_matricula;
		this.alumno = alumno;
		this.fecha = fecha;
	}

	public Long getId_matricula() {
		return id_matricula;
	}

	public void setId_matricula(Long id_matricula) {
		this.id_matricula = id_matricula;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
	
}
