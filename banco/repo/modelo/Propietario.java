package com.example.demo.banco.repo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "propietario")
public class Propietario {
	
	@Id
	@SequenceGenerator(name = "seq_propietario",sequenceName = "seq_propietario",allocationSize = 1)
	@GeneratedValue(generator = "seq_propietario",strategy = GenerationType.SEQUENCE)
	@Column(name ="prop_id")
	private Integer id;
	
	@Column(name="prop_nom")
	private String nombre;
	
	@Column(name="prop_nom")
	private String apellido;
	
	@Column(name="prop_nom")
	private String cedula;
	
	
	@OneToMany()
	private CuentaBancaria cuentaBancaria;
	
	
	
	
	
	
	

}
