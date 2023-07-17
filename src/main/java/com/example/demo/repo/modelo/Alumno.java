package com.example.demo.repo.modelo;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "alumno")
@Entity
public class Alumno {

	@Id
	@SequenceGenerator(name = "seq_alumno", sequenceName = "seq_alumno", allocationSize = 1)
	@GeneratedValue(generator = "seq_alumno", strategy = GenerationType.SEQUENCE)
	@Column(name = "alum_id")
	private Integer id;
	
	@Column(name = "alum_nombre")
	private String nombre;

	@OneToMany(mappedBy = "alumno",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Matricula> matriculas;
	
	

	// get y set

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre +  "]";
	}

}
