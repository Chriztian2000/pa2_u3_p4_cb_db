package com.example.demo.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Alumno;
import com.example.demo.repo.modelo.Hotel;
import com.example.demo.repo.modelo.Matricula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MatriculaRepoImpl implements MatriculaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Matricula matricula) {

		this.entityManager.persist(matricula);
	}

	// --------------------------------------------------------------------------------------------------------

	@Override
	public List<Matricula> seleccionaMatriculaInnerJoin() {
		TypedQuery<Matricula> myQuery = this.entityManager
				.createQuery("SELECT m FROM Matricula m INNER JOIN m.alumno a ", Matricula.class);
		return myQuery.getResultList();

	}

	@Override
	public List<Matricula> seleccionaMatriculaOuterRightJoin() {
		TypedQuery<Matricula> myQuery = this.entityManager
				.createQuery("SELECT m FROM Matricula m RIGHT JOIN m.alumno a ", Matricula.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Matricula> seleccionaMatriculaOuterLeftrJoin() {
		TypedQuery<Matricula> myQuery = this.entityManager
				.createQuery("SELECT m FROM Matricula m LEFT JOIN m.alumno a ", Matricula.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Matricula> seleccionaMatriculaOuterFullJoin() {
		TypedQuery<Matricula> myQuery = this.entityManager
				.createQuery("SELECT m FROM Matricula m FULL JOIN m.alumno a ", Matricula.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Matricula> seleccionaMatriculaOuterJoin() {
		TypedQuery<Matricula> myQuery = this.entityManager
				.createQuery("SELECT m FROM Matricula m OUTER JOIN m.alumno a ", Matricula.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Alumno> seleccionaInnerJoin() {
		TypedQuery<Alumno> myQuery = this.entityManager.createQuery("SELECT al FROM Matricula m JOIN m.alumno al ",
				Alumno.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Alumno> seleccionaAlumnoOuterRightJoin() {
		TypedQuery<Alumno> myQuery = this.entityManager
				.createQuery("SELECT al FROM Matricula m RIGHT JOIN m.alumno al ", Alumno.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Alumno> seleccionaAlumnoOuterLeftJoin() {
		TypedQuery<Alumno> myQuery = this.entityManager.createQuery("SELECT al FROM Matricula m LEFT JOIN m.alumno al ",
				Alumno.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Alumno> seleccionaAlumnoaOuterFullJoin() {
		TypedQuery<Alumno> myQuery = this.entityManager.createQuery("SELECT al FROM Matricula m FULL JOIN m.alumno al ",
				Alumno.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Alumno> seleccionaAlumnoOuterJoin() {
		TypedQuery<Alumno> myQuery = this.entityManager
				.createQuery("SELECT al FROM Matricula m OUTER JOIN m.alumno al ", Alumno.class);
		return myQuery.getResultList();
	}

}
