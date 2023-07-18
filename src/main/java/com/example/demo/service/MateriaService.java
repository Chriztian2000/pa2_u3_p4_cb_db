package com.example.demo.service;

import java.util.List;

import com.example.demo.repo.modelo.Materia;

public interface MateriaService {
	
	public void guardar(Materia materia);
	public List<Materia> buscarPorCodigo (String codigo);
	
	

}
