package com.example.demo.repo;

import java.util.List;

import com.example.demo.repo.modelo.Habitacion;
import com.example.demo.repo.modelo.Hotel;

public interface HotelRepo {

	/*
	 * public void insertar(Hotel hotel); public void actualizar(Hotel hotel);
	 * public Hotel buscar(Integer id); public void eliminar(Integer id);
	 */

	// -----------------------------------------------
	// Inner Join
	public List<Hotel> seleccionaHotelInnerJoin();

	// OuterJoin
	public List<Hotel> seleccionaHotelOuterRightJoin();

	public List<Hotel> seleccionaHotelOuterLeftJoin();

	public List<Habitacion> seleccionaHabitacionOuterLeftJoin();

	public List<Hotel> seleccionaHotelOuterFullJoin();

	//public List<Habitacion> seleccionaHabitacionOuterFullJoin();
	
	//join where
	public List<Hotel> selecionaHotelJoinWhere();
	
	public List<Hotel> selecionaHotelJoinFetch();
	
	public void insertarHotel(Hotel hotel);
	

}
