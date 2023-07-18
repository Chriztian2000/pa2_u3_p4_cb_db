package com.example.demo.repo.modelo;

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

@Entity
@Table(name = "matricula")
public class Matricula {

	@Id
    @SequenceGenerator(name = "seq_matricula", sequenceName = "seq_matricula", allocationSize = 1)
    @GeneratedValue(generator = "seq_matricula", strategy = GenerationType.SEQUENCE)
    @Column(name = "mtcl_id")   
	private Integer id;
	
	@Column(name = "mtcl_fecha")
	private LocalDateTime fecha;
	
	@Column(name = "mtcl_numero")
	private String numero;
	
	@Column(name = "mtcl_gratuidad")
	private String gratuidad;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name ="matricula_id_estudiante")
	private Estudiante estudiante;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name ="matricula_id_materia")
	private Materia materia;

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

	public String getGratuidad() {
		return gratuidad;
	}

	public void setGratuidad(String gratuidad) {
		this.gratuidad = gratuidad;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Matricula [id=" + id + ", fecha=" + fecha + ", numero=" + numero + ", gratuidad=" + gratuidad
				+"]";
	}
	
	
	
	
}
