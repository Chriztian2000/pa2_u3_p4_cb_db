package com.example.demo.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HotelRepoImpl implements IHotelRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Hotel> seleccionaHotelInnerJoin() {
		
		//SELECT * from hotel h inner join habitacion ha on h.hote_id = ha.habitacion_id_hotel
									// h.habitaciones -> relacion que hacer referencia a las habitaciones
		// SELECT h FROM Hotel h JOIN h.habitaciones ha  
		
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery("SELECT h FROM Hotel h JOIN h.habitaciones ha ", Hotel.class);
		return myQuery.getResultList();
	}
	

}
