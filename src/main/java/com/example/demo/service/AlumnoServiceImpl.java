package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.AlumnoRepo;
import com.example.demo.repo.modelo.Alumno;

@Service 
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoRepo alumnoRepo;

	@Override
	public void crear(Alumno alumno) {
		this.alumnoRepo.insertar(alumno);

	}

}
