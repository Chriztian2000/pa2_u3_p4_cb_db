package com.example.demo.matricula.service;

import com.example.demo.matricula.repo.modelo.Materia;

public interface IMateriaService {
	
	public void ingresar(Materia materia);
	public void modificar(Materia materia);
	public Materia selecionar(Integer id);
	public void borrar(Integer id);
	



}
