package com.example.demo.repo;

import java.util.List;

import com.example.demo.repo.modelo.Estudiante;

public interface EstudianteRepo {

	
	public void insertar (Estudiante estudiante);
	public List<Estudiante> seleccionarPorCedula (String cedula);
	
}
