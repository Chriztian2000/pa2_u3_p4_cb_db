package com.example.demo.matricula.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matricula.repo.IMatriculaRepo;
import com.example.demo.matricula.repo.modelo.Matricula;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepo iMatriculaRepo;

	@Override
	public List<Matricula> buscarMatrilaIinnerJoin() {
		// TODO Auto-generated method stub
		return this.iMatriculaRepo.seleccionarMatrilaIinnerJoin();
	}

	@Override
	public List<Matricula> buscarOuterRigthJoin() {
		// TODO Auto-generated method stub
		return this.iMatriculaRepo.seleccionarOuterRigthJoin();
	}

	@Override
	public List<Matricula> buscarOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.iMatriculaRepo.seleccionarOuterLeftJoin();
	}

	@Override
	public List<Matricula> buscarfullJoin() {
		// TODO Auto-generated method stub
		return this.iMatriculaRepo.seleccionarfullJoin();
	}

	@Override
	public void ingresar(Matricula matricula) {
		this.iMatriculaRepo.insertar(matricula);

	}

	@Override
	public List<Matricula> buscarAlumnoIinnerJoin() {
		// TODO Auto-generated method stub
		return this.iMatriculaRepo.seleccionarAlumnoIinnerJoin();
	}

	@Override
	public List<Matricula> buscarAlumnoOuterRigthJoin() {
		// TODO Auto-generated method stub
		return this.iMatriculaRepo.seleccionarAlumnoOuterRigthJoin();
	}

	@Override
	public List<Matricula> buscarAlumnoOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.iMatriculaRepo.seleccionarAlumnoOuterLeftJoin();
	}

	@Override
	public List<Matricula> buscarAlumnofullJoin() {
		// TODO Auto-generated method stub
		return this.iMatriculaRepo.seleccionarAlumnofullJoin();
	}

	@Override
	public List<Matricula> buscarWhereJoin() {
		// TODO Auto-generated method stub
		return this.iMatriculaRepo.selecionarWhereJoin();
	}

	@Override
	public List<Matricula> buscarAlumnoWhereJoin() {
		// TODO Auto-generated method stub
		return this.iMatriculaRepo.selecionarAlumnoWhereJoin();
	}

}
