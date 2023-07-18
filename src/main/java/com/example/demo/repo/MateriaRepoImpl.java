package com.example.demo.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MateriaRepoImpl implements MateriaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Materia materia) {
		this.entityManager.persist(materia);
	}

	@Override
	public List<Materia> seleccionarPorCodigo(String codigo) {		
		Query myQuery = this.entityManager.createQuery("SELECT m FROM Matricula m WHERE m.codigo = :datoCodigo");
		myQuery.setParameter("datoCodigo", codigo);		
		return myQuery.getResultList();
	}

}
