package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.EstudianteRepo;
import com.example.demo.repo.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements EstudianteService{

	@Autowired
	private EstudianteRepo estudianteRepo;

	@Override
	public void guardar(Estudiante estudiante) {
this.estudianteRepo.insertar(estudiante);		
	}

	@Override
	public List<Estudiante> buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarPorCedula(cedula);
	}
	
}
