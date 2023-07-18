package com.example.demo.repo;

import java.util.List;

import com.example.demo.repo.modelo.Materia;

public interface MateriaRepo {

	public void insertar (Materia materia);
	public List<Materia> seleccionarPorCodigo (String codigo);
	
	
	
}
