package com.example.demo.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Matricula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
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

	
	
	

}
