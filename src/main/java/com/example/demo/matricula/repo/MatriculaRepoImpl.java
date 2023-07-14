package com.example.demo.matricula.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matricula.repo.modelo.Matricula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MatriculaRepoImpl implements IMatriculaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Matricula matricula) {
		this.entityManager.persist(matricula);

	}

	@Override
	public List<Matricula> seleccionarMatrilaIinnerJoin() {
		// TODO Auto-generated method stub

		TypedQuery<Matricula> myQuery = this.entityManager.createQuery("SELECT m FROM Matricula m JOIN m.materia ma",
				Matricula.class);

		return myQuery.getResultList();
	}

	@Override
	public List<Matricula> seleccionarOuterRigthJoin() {

		TypedQuery<Matricula> myQuery = this.entityManager
				.createQuery("SELECT m FROM Matricula m RIGHT JOIN m.materia ma", Matricula.class);

		return myQuery.getResultList();
	}

	@Override
	public List<Matricula> seleccionarOuterLeftJoin() {
		TypedQuery<Matricula> myQuery = this.entityManager
				.createQuery("SELECT m FROM Matricula m LEFT JOIN m.materia ma", Matricula.class);

		return myQuery.getResultList();
	}

	@Override
	public List<Matricula> seleccionarfullJoin() {
		TypedQuery<Matricula> myQuery = this.entityManager
				.createQuery("SELECT m FROM Matricula m FULL OUTER JOIN m.materia ma", Matricula.class);

		return myQuery.getResultList();
	}

	@Override
	public List<Matricula>selecionarWhereJoin(){
		TypedQuery<Matricula> query = this.entityManager.createQuery("SELECT m FROM Matricula m, Materia ma WHERE m=ma.Matricula", Matricula.class);
		return query.getResultList();
	}
	
	
	
	

	@Override
	public List<Matricula> seleccionarAlumnoIinnerJoin() {
		TypedQuery<Matricula> myQuery = this.entityManager.createQuery("SELECT m FROM Matricula m JOIN m.alumno alu",
				Matricula.class);

		return myQuery.getResultList();
	}

	@Override
	public List<Matricula> seleccionarAlumnoOuterRigthJoin() {
		TypedQuery<Matricula> myQuery = this.entityManager.createQuery("SELECT m FROM Matricula m RIGHT JOIN m.alumno alu",
				Matricula.class);

		return myQuery.getResultList();
	}

	@Override
	public List<Matricula> seleccionarAlumnoOuterLeftJoin() {
		TypedQuery<Matricula> myQuery = this.entityManager.createQuery("SELECT m FROM Matricula m LEFT JOIN m.alumno alu",
				Matricula.class);

		return myQuery.getResultList();
	}

	@Override
	public List<Matricula> seleccionarAlumnofullJoin() {
		TypedQuery<Matricula> myQuery = this.entityManager.createQuery("SELECT m FROM Matricula m FULL JOIN m.alumno alu",
				Matricula.class);

		return myQuery.getResultList();
	}

	@Override
	public List<Matricula> selecionarAlumnoWhereJoin() {
		TypedQuery<Matricula> query = this.entityManager.createQuery("SELECT m FROM Matricula m, Alumno alu WHERE m=alu.Matricula", Matricula.class);
		return query.getResultList();
	}

}
