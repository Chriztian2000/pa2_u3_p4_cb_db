package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.MatriculaRepo;
import com.example.demo.repo.modelo.Alumno;
import com.example.demo.repo.modelo.Matricula;

@Service
public class MatriculaServiceImpl implements MatriculaService{

	@Autowired
	private MatriculaRepo matriculaRepo;
	
	@Override
	public void crear(Matricula matricula) {
		this.matriculaRepo.insertar(matricula);
		
	}

	@Override
	public List<Matricula> buscarMatriculaInnerJoin() {
		// TODO Auto-generated method stub
		return this.matriculaRepo.seleccionaMatriculaInnerJoin();
	}

	@Override
	public List<Matricula> buscarMatriculaOuterRightJoin() {
		// TODO Auto-generated method stub
		return this.matriculaRepo.seleccionaMatriculaOuterRightJoin();
	}

	@Override
	public List<Matricula> buscarMatriculaOuterLeftrJoin() {
		// TODO Auto-generated method stub
		return this.matriculaRepo.seleccionaMatriculaOuterLeftrJoin();
	}

	@Override
	public List<Matricula> buscarMatriculaOuterFullJoin() {
		// TODO Auto-generated method stub
		return this.matriculaRepo.seleccionaMatriculaOuterFullJoin();
	}

	@Override
	public List<Matricula> buscarMatriculaOuterJoin() {
		// TODO Auto-generated method stub
		return this.matriculaRepo.seleccionaMatriculaOuterJoin();
	}

	@Override
	public List<Alumno> buscarAlumnoInnerJoin() {
		// TODO Auto-generated method stub
		return this.matriculaRepo.seleccionaInnerJoin();
		
	}

	@Override
	public List<Alumno> buscarAlumnoOuterRightJoin() {
		// TODO Auto-generated method stub
		return this.matriculaRepo.seleccionaAlumnoOuterRightJoin();
	}

	@Override
	public List<Alumno> buscarAlumnoOuterLeftrJoin() {
		// TODO Auto-generated method stub
		return this.matriculaRepo.seleccionaAlumnoOuterLeftJoin();
	}

	@Override
	public List<Alumno> buscarAlumnoOuterFullJoin() {
		// TODO Auto-generated method stub
		return this.matriculaRepo.seleccionaAlumnoaOuterFullJoin();
	}

	@Override
	public List<Alumno> buscarAlumnoOuterJoin() {
		// TODO Auto-generated method stub
		return this.matriculaRepo.seleccionaAlumnoOuterJoin();
	}



}
