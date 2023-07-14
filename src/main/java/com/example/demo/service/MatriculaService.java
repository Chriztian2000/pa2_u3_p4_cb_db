package com.example.demo.service;

import java.util.List;

import com.example.demo.repo.modelo.Alumno;
import com.example.demo.repo.modelo.Matricula;

public interface MatriculaService {

	public void crear(Matricula matricula);

	// INNER JOIN
	public List<Matricula> buscarMatriculaInnerJoin();

	public List<Alumno> buscarAlumnoInnerJoin();

	// OUTER RIGHT JOIN
	public List<Matricula> buscarMatriculaOuterRightJoin();

	public List<Alumno> buscarAlumnoOuterRightJoin();

	// OUTER LEFT JOIN
	public List<Matricula> buscarMatriculaOuterLeftrJoin();

	public List<Alumno> buscarAlumnoOuterLeftrJoin();

	// OUTER FULL JOIN
	public List<Matricula> buscarMatriculaOuterFullJoin();

	public List<Alumno> buscarAlumnoOuterFullJoin();

	// OUTER JOIN
	public List<Matricula> buscarMatriculaOuterJoin();

	public List<Alumno> buscarAlumnoOuterJoin();

}
