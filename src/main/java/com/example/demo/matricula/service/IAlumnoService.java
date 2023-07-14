package com.example.demo.matricula.service;

import com.example.demo.matricula.repo.modelo.Alumno;

public interface IAlumnoService {
	
	public void ingresar(Alumno alumno);
	public void modificar(Alumno alumno);
	public Alumno encontrar(Integer id);
	public void borrar(Integer id);
	
	//deber con JOIN'S
	


}
