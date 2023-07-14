package com.example.demo.matricula.repo;

import org.springframework.stereotype.Service;

import com.example.demo.matricula.repo.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class MateriaRepoImp implements IMateriaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crear(Materia materia) {
		this.entityManager.persist(materia);

	}

	@Override
	public void actualizar(Materia materia) {
		this.entityManager.merge(materia);

	}

	@Override
	public Materia buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Materia.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		this.entityManager.remove(this.buscar(id));

	}


}
