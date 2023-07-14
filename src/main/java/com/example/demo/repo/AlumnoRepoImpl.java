package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Alumno;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AlumnoRepoImpl implements AlumnoRepo{


	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Alumno alumno) {
		this.entityManager.persist(alumno);
		
	}

}
