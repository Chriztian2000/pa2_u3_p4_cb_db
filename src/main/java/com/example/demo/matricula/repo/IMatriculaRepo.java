package com.example.demo.matricula.repo;

import java.util.List;

import com.example.demo.matricula.repo.modelo.Matricula;

public interface IMatriculaRepo {
	
	public void insertar(Matricula matricula);

	public List<Matricula> seleccionarMatrilaIinnerJoin();

	public List<Matricula> seleccionarOuterRigthJoin();

	public List<Matricula> seleccionarOuterLeftJoin();

	public List<Matricula> seleccionarfullJoin();
	
	public List<Matricula>selecionarWhereJoin();
	
	
	public List<Matricula> seleccionarAlumnoIinnerJoin();
	
	public List<Matricula> seleccionarAlumnoOuterRigthJoin();

	public List<Matricula> seleccionarAlumnoOuterLeftJoin();

	public List<Matricula> seleccionarAlumnofullJoin();

	public List<Matricula>selecionarAlumnoWhereJoin();
	
	
	

}
