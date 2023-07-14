package com.example.demo.matricula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matricula.repo.IMateriaRepo;
import com.example.demo.matricula.repo.modelo.Materia;

@Service
public class MateriaServiceImp implements IMateriaService {

	@Autowired
	private IMateriaRepo iMateriaRepo;

	@Override
	public void ingresar(Materia materia) {
		this.iMateriaRepo.crear(materia);

	}

	@Override
	public void modificar(Materia materia) {
		// TODO Auto-generated method stub
		this.iMateriaRepo.actualizar(materia);
	}

	@Override
	public Materia selecionar(Integer id) {
		// TODO Auto-generated method stub
		return this.iMateriaRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iMateriaRepo.eliminar(id);
	}

}
