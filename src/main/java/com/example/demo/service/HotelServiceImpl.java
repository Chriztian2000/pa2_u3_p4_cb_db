package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IHotelRepo;
import com.example.demo.repo.modelo.Habitacion;
import com.example.demo.repo.modelo.Hotel;

@Service
public class HotelServiceImpl implements IHotelService {

	@Autowired
	private IHotelRepo hotelRepo;
	
	@Override
	public List<Hotel> buscarHotelInnerJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepo.seleccionaHotelInnerJoin();
	}

	@Override
	public List<Hotel> buscarHotelOuterRightJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepo.seleccionaHotelOuterRightJoin();
	}
	
	@Override
	public List<Hotel> buscarHotelOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepo.seleccionaHotelOuterLeftJoin();
	}

	@Override
	public List<Habitacion> buscarHabitacionOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepo.seleccionaHabitacionOuterLeftJoin();
	}
	
	@Override
	public List<Hotel> buscarHotelOuterFullJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepo.seleccionaHotelOuterFullJoin();
	}

	@Override
	public List<Hotel> buscarHotelJoinWhere() {
		// TODO Auto-generated method stub
		return this.hotelRepo.selecionaHotelJoinWhere();
	}

}
