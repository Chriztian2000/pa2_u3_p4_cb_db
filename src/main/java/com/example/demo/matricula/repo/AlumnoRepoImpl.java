package com.example.demo.matricula.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matricula.repo.modelo.Alumno;
import com.example.demo.matricula.repo.modelo.Matricula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AlumnoRepoImpl implements IAlumnoRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crear(Alumno alumno) {
		this.entityManager.persist(alumno);
	}

	@Override
	public void actualizar(Alumno alumno) {
		this.entityManager.merge(alumno);

	}

	@Override
	public Alumno buscar(Integer id) {

		return this.entityManager.find(Alumno.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		this.entityManager.remove(this.buscar(id));

	}


}
