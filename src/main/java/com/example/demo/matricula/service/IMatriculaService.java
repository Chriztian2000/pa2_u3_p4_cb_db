package com.example.demo.matricula.service;

import java.util.List;

import com.example.demo.matricula.repo.modelo.Matricula;

public interface IMatriculaService {

	public void ingresar(Matricula matricula);

	public List<Matricula> buscarMatrilaIinnerJoin();

	public List<Matricula> buscarOuterRigthJoin();

	public List<Matricula> buscarOuterLeftJoin();

	public List<Matricula> buscarfullJoin();
	
	public List<Matricula> buscarWhereJoin();
	
	
	public List<Matricula> buscarAlumnoIinnerJoin();
	
	public List<Matricula> buscarAlumnoOuterRigthJoin();

	public List<Matricula> buscarAlumnoOuterLeftJoin();

	public List<Matricula> buscarAlumnofullJoin();
	
	public List<Matricula> buscarAlumnoWhereJoin();
	

	

}
