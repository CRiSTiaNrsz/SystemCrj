package com.colegio.sistemaCRJ.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="anoescolar")
public class AnoEscolar {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_anoEscolar;
	
	@NotNull
	private int ano;
	
	public AnoEscolar() {
		
	}

	public AnoEscolar(Long id_anoEscolar, @NotNull int ano) {
		super();
		this.id_anoEscolar = id_anoEscolar;
		this.ano = ano;
	}

	public Long getId_anoEscolar() {
		return id_anoEscolar;
	}

	public void setId_anoEscolar(Long id_anoEscolar) {
		this.id_anoEscolar = id_anoEscolar;
	}

	public int getano() {
		return ano;
	}

	public void setano(int ano) {
		this.ano = ano;
	}
	
	
}
