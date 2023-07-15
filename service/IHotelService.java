package com.example.demo.service;

import java.util.List;

import com.example.demo.repo.modelo.Habitacion;
import com.example.demo.repo.modelo.Hotel;

public interface IHotelService {

	// -----------------------------------------------
	// Inner Join
	public List<Hotel> buscarHotelInnerJoin();

	public List<Hotel> buscarHotelOuterRightJoin();

	public List<Hotel> buscarHotelOuterLeftJoin();

	public List<Habitacion> buscarHabitacionOuterLeftJoin();

	public List<Hotel> buscarHotelOuterFullJoin();
	
	public List<Hotel> buscarHotelJoinWhere();
	
	public List<Hotel> buscarFetchJoin();
	
	 public void agregar(Hotel hotel); 

}