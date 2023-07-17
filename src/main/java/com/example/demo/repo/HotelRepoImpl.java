package com.example.demo.repo;

import java.math.BigDecimal;
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
public class HotelRepoImpl implements HotelRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Hotel> seleccionaHotelInnerJoin() {

		// SELECT * from hotel h inner join habitacion ha on h.hote_id =
		// ha.habitacion_id_hotel
		// h.habitaciones -> relacion que hacer referencia a las habitaciones
		// SELECT f FROM Factura f JOIN f.detalle de
		// SELECT h FROM Hotel h JOIN h.habitaciones ha

		TypedQuery<Hotel> myQuery = this.entityManager
				.createQuery("SELECT h FROM Hotel h INNER JOIN h.habitaciones ha ", Hotel.class);
		
		List<Hotel> listaHoteles = myQuery.getResultList();
		for (Hotel h : listaHoteles) {
			h.getHabitaciones().size();
		}
		
		return myQuery.getResultList();
	}

	@Override
	public List<Hotel> seleccionaHotelOuterRightJoin() {

		TypedQuery<Hotel> myQuery = this.entityManager
				.createQuery("SELECT h FROM Hotel h RIGHT JOIN h.habitaciones ha ", Hotel.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Hotel> seleccionaHotelOuterLeftJoin() {

		TypedQuery<Hotel> myQuery = this.entityManager.createQuery("SELECT h FROM Hotel h LEFT JOIN h.habitaciones ha ",
				Hotel.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Habitacion> seleccionaHabitacionOuterLeftJoin() {

		TypedQuery<Habitacion> myQuery = this.entityManager
				.createQuery("SELECT ha FROM Hotel h LEFT JOIN h.habitaciones ha ", Habitacion.class);
		return myQuery.getResultList();
	}
	

	public List<Hotel> seleccionaHotelOuterFullJoin() {

		TypedQuery<Hotel> myQuery = this.entityManager.createQuery("SELECT h FROM Hotel h FULL JOIN h.habitaciones ha ",
				Hotel.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Hotel> selecionaHotelJoinWhere() {
		// SQL
		// SELECT h.* FROM hotel h , habitacion ha WHERE ha on h.hote_id
		// =ha.habitacion_id_hotel
		// JPQL
		// SELECT h FROM Hotel h, Habitacion ha WHERE h =ha.hotel
		TypedQuery<Hotel> myQuery = this.entityManager
				.createQuery("SELECT h FROM Hotel h, Habitacion ha WHERE h =ha.hotel", Hotel.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Hotel> selecionaHotelJoinFetch() {
		TypedQuery<Hotel> myQuery = this.entityManager
				.createQuery("SELECT h FROM Hotel h JOIN FETCH h.habitaciones ha ", Hotel.class);
		
	
		
		return myQuery.getResultList();
	}

	@Override
	public void insertarHotel(Hotel hotel) {
		
		
		this.entityManager.persist(hotel);
		
	}

}
