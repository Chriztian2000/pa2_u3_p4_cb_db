package com.example.demo.service;

import java.util.List;

import com.example.demo.repo.modelo.Estudiante;

public interface EstudianteService {
	
	public void guardar (Estudiante estudiante);
	public List<Estudiante> buscarPorCedula (String cedula);
	

}
