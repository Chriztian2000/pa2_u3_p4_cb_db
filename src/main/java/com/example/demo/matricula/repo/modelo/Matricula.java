package com.example.demo.matricula.repo.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "matricula")
@Entity
public class Matricula {

	@Id
	@SequenceGenerator(name = "seq_matricula", sequenceName = "seq_matricula", allocationSize = 1)
	@GeneratedValue(generator = "seq_matricula", strategy = GenerationType.SEQUENCE)
	@Column(name = "matri_id")
	private Integer id;
	@Column(name = "matri_fecha")
	private LocalDateTime fecha;
	@Column(name = "matri_numero")
	private String numero;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "matri_id_alumno")
	private Alumno alumno;

	@ManyToOne(cascade = CascadeType.ALL,  fetch = FetchType.LAZY)
	@JoinColumn(name = "matri_id_materia")
	private Materia materia;

	// get y set

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Matricula [id=" + id + ", fecha=" + fecha + ", numero=" + numero + "]";
	}

}
