package com.example.demo.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Habitacion;
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

		// SELECT * from hotel h inner join habitacion ha on h.hote_id =
		// ha.habitacion_id_hotel
		// h.habitaciones -> relacion que hacer referencia a las habitaciones
		// SELECT h FROM Hotel h JOIN h.habitaciones ha

		TypedQuery<Hotel> myQuery = this.entityManager.createQuery("SELECT h FROM Hotel h JOIN h.habitaciones ha ",
				Hotel.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Hotel> seleccionarOuterRightJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> query = this.entityManager.createQuery("SELECT h from Hotel h RIGHT JOIN h.habitaciones ha ",
				Hotel.class);
		return query.getResultList();

	}

	@Override
	public List<Hotel> seleccionarOuterLeftJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> query = this.entityManager.createQuery("SELECT h from Hotel h LEFT JOIN h.habitaciones ha ",
				Hotel.class);
		return query.getResultList();

	}

	@Override
	public List<Habitacion> seleccionarHabitacionOuterLeftJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Habitacion> query = this.entityManager
				.createQuery("SELECT ha from Habitacion ha LEFT JOIN ha.hotel h ", Habitacion.class);
		return query.getResultList();

	}

	@Override
	public List<Hotel> seleccionarFulltJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> query = this.entityManager
				.createQuery("SELECT h from Hotel h FULL OUTER JOIN h.habitaciones ha ", Hotel.class);
		return query.getResultList();
	}

	@Override
	public List<Hotel> seleccionarWhereJoin() {
		// TODO Auto-generated method stub
		// SELECT h.* FROM hotel h, habitacion ha WHERE h.hote_id=
		// ha.habitacion_id_hotel
		// SELECT h FROM Hotel h, Habitacion ha WHERE h=ha.hotel
		TypedQuery<Hotel> query = this.entityManager
				.createQuery("SELECT h FROM Hotel h, Habitacion ha WHERE h=ha.hotel", Hotel.class);
		return query.getResultList();
	}

}
