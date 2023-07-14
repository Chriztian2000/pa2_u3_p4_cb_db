package com.example.demo.matricula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matricula.repo.IAlumnoRepo;
import com.example.demo.matricula.repo.modelo.Alumno;

@Service
public class AlumnoServiceImple implements IAlumnoService {
	@Autowired
	private IAlumnoRepo iAlumnoRepo;

	@Override
	public void ingresar(Alumno alumno) {
		this.iAlumnoRepo.crear(alumno);

	}

	@Override
	public void modificar(Alumno alumno) {
		this.iAlumnoRepo.actualizar(alumno);

	}

	@Override
	public Alumno encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.iAlumnoRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		this.iAlumnoRepo.eliminar(id);

	}

}
