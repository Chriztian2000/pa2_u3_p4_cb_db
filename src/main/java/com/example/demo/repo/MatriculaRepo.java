package com.example.demo.repo;

import java.util.List;

import com.example.demo.repo.modelo.Alumno;
import com.example.demo.repo.modelo.Matricula;

public interface MatriculaRepo {

	public void insertar(Matricula matricula);
	
	// INNER JOIN
	public List<Matricula> seleccionaMatriculaInnerJoin();
	public List<Alumno> seleccionaInnerJoin();
	
			
	// OUTER RIGHT JOIN
	public List<Matricula> seleccionaMatriculaOuterRightJoin();
	public List<Alumno> seleccionaAlumnoOuterRightJoin();
	
	// OUTER LEFT JOIN
	public List<Matricula> seleccionaMatriculaOuterLeftrJoin();
	public List<Alumno> seleccionaAlumnoOuterLeftJoin();
	
	// OUTER FULL JOIN
	public List<Matricula> seleccionaMatriculaOuterFullJoin();
	public List<Alumno> seleccionaAlumnoaOuterFullJoin();
	// OUTER JOIN
	public List<Matricula> seleccionaMatriculaOuterJoin();
	public List<Alumno> seleccionaAlumnoOuterJoin();
	
}
