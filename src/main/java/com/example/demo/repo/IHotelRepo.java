package com.example.demo.repo;

import java.util.List;

import com.example.demo.repo.modelo.Habitacion;
import com.example.demo.repo.modelo.Hotel;

public interface IHotelRepo {
	
	/*
	public void insertar(Hotel hotel);
	public void actualizar(Hotel hotel);
	public Hotel buscar(Integer id);
	public void eliminar(Integer id);
	*/
	
	
	//-----------------------------------------------
	//Inner Join
	public List<Hotel> seleccionaHotelInnerJoin();
	
	// RightJoin
	public List<Hotel> seleccionarOuterRightJoin();

	// LeftJoin
	public List<Hotel> seleccionarOuterLeftJoin();
	
	public List<Habitacion> seleccionarHabitacionOuterLeftJoin();
    //Full JOIN
	public List<Hotel> seleccionarFulltJoin();
	
	//JOIN WHERE
	public List<Hotel> seleccionarWhereJoin();
	
	 


}
