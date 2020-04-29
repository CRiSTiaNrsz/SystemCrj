package com.colegio.sistemaCRJ.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="docente")
public class Docente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_docente;
	
	@NotNull
	private String nombre;
	
	@NotNull
	private String apellido;
	
	@NotNull
	@Column(unique=true,length=8)
	private String dni;
	
	@NotNull
	private String sexo;
	
	@NotNull
	private String direccion;
	
	@NotNull
	@Column(unique=true)
	private String correo;
	
	@NotNull
	@Column(unique=true)
	private String telefono;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date fechanacimiento;

	
	
	public Docente() {
		
	}

	public Docente(Long id_docente, @NotNull String nombre, @NotNull String apellido, @NotNull String dni,
			@NotNull String sexo, @NotNull String direccion, @NotNull String correo, @NotNull String telefono,
			@NotNull Date fechanacimiento) {
		super();
		this.id_docente = id_docente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.sexo = sexo;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.fechanacimiento = fechanacimiento;
	}

	public Long getId_docente() {
		return id_docente;
	}

	public void setId_docente(Long id_docente) {
		this.id_docente = id_docente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	
	
}
