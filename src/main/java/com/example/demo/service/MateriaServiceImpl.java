package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.MateriaRepo;
import com.example.demo.repo.modelo.Materia;

@Service
public class MateriaServiceImpl implements MateriaService {

	@Autowired
	private MateriaRepo materiaRepo;

	@Override
	public void guardar(Materia materia) {
		this.materiaRepo.insertar(materia);
	}

	@Override
	public List<Materia> buscarPorCodigo(String codigo) {
		
		return this.materiaRepo.seleccionarPorCodigo(codigo);
	}

}
