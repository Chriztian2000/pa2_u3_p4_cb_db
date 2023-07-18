package com.example.demo.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepoImpl implements EstudianteRepo {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Estudiante estudiante) {
		this.entityManager.persist(estudiante);
		
	}

	@Override
	public List<Estudiante> seleccionarPorCedula(String cedula) {
		
		Query myQuery = this.entityManager.createQuery("SELECT m FROM Matricula m WHERE m.cedula = :datoCedula");
		myQuery.setParameter("datoCedula", cedula);		
		return myQuery.getResultList();
	}

	
	
}
