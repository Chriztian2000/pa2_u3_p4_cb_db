package com.example.demo.matricula.repo;

import com.example.demo.matricula.repo.modelo.Alumno;

public interface IAlumnoRepo {
	
	public void crear(Alumno alumno);
	public void actualizar(Alumno alumno);
	public Alumno buscar(Integer id);
	public void eliminar(Integer id);
	
	

	
	

}
