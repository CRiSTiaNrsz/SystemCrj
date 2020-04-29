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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="asignacion")
public class Asignacion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_asignacion;
	
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="id_docente",referencedColumnName="id_docente")
	private Docente docente;
	
	@ManyToOne(optional = false, cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="id_grado",referencedColumnName="id_grado")
	private Grado grado;
	
	@ManyToOne(optional = false, cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="id_curso",referencedColumnName="id_curso")
	private Curso curso;
	
	@OneToOne
	@JoinColumn(name = "id_frecuencia", updatable = false, nullable = false,referencedColumnName="id_frecuencia")
	private Frecuencia frecuencia;
	 
	@OneToOne
	@JoinColumn(name = "id_anoEscolar", updatable = false, nullable = false,referencedColumnName="id_anoEscolar")
	private AnoEscolar anoEscolar;
	 
	
	@Temporal(TemporalType.TIME)
	private Date hora_inicio;
	
	
	
	@Temporal(TemporalType.TIME)
	private Date hora_final;
	
	@NotNull
	private int vacantes;
	
	private String estado;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date fecha_inicio;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date fecha_final;
	
	
	public Asignacion() {
		
	}
	
	public Asignacion(Long id_asignacion, Docente docente, Grado grado, Curso curso, Frecuencia frecuencia,
			AnoEscolar anoescolar, Date hora_inicio, Date hora_final, @NotNull int vacantes, String estado,
			@NotNull Date fecha_inicio, @NotNull Date fecha_final) {
		super();
		this.id_asignacion = id_asignacion;
		this.docente = docente;
		this.grado = grado;
		this.curso = curso;
		this.frecuencia = frecuencia;
		this.anoEscolar = anoescolar;
		this.hora_inicio = hora_inicio;
		this.hora_final = hora_final;
		this.vacantes = vacantes;
		this.estado = estado;
		this.fecha_inicio = fecha_inicio;
		this.fecha_final = fecha_final;
	}

	public Frecuencia getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(Frecuencia frecuencia) {
		this.frecuencia = frecuencia;
	}

	public AnoEscolar getanoescolar() {
		return anoEscolar;
	}


	public void setanoescolar(AnoEscolar anoescolar) {
		this.anoEscolar = anoescolar;
	}

	public Curso getCurso() {
		return curso;
	}


	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Long getId_asignacion() {
		return id_asignacion;
	}

	public void setId_asignacion(Long id_asignacion) {
		this.id_asignacion = id_asignacion;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Grado getGrado() {
		return grado;
	}

	public void setGrado(Grado grado) {
		this.grado = grado;
	}

	public Date getHora_inicio() {
		return hora_inicio;
	}

	public void setHora_inicio(Date hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	public Date getHora_final() {
		return hora_final;
	}

	public void setHora_final(Date hora_final) {
		this.hora_final = hora_final;
	}

	public int getVacantes() {
		return vacantes;
	}

	public void setVacantes(int vacantes) {
		this.vacantes = vacantes;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_final() {
		return fecha_final;
	}

	public void setFecha_final(Date fecha_final) {
		this.fecha_final = fecha_final;
	}
	
	
}
