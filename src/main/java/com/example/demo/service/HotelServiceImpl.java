package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.HotelRepo;
import com.example.demo.repo.modelo.Habitacion;
import com.example.demo.repo.modelo.Hotel;

@Service
public class HotelServiceImpl implements IHotelService {

	@Autowired
	private HotelRepo hotelRepo;

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

	@Override
	public List<Hotel> buscarHotelJoinFetch() {
		// TODO Auto-generated method stub
		return this.hotelRepo.selecionaHotelJoinFetch();
	}

	@Override
	public void guardarHotel(Hotel hotel) {

		
		this.hotelRepo.insertarHotel(hotel);

	}

}
