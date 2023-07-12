package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.modelo.Habitacion;
import com.example.demo.repo.modelo.Hotel;
import com.example.demo.service.IHotelService;

@SpringBootApplication
public class Pa2U3P4CbDbApplication implements CommandLineRunner {

	@Autowired
	private IHotelService hotelService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P4CbDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<Hotel> listaHotel = this.hotelService.buscarHotelInnerJoin();
		for (Hotel h : listaHotel) {
			System.out.println(h);
		}
		
		List<Hotel> listaHote2 = this.hotelService.buscarHotelOuterFullJoin();
		for (Hotel h : listaHote2) {
			
			if(h== null) {
				System.out.println("No existe aun un hotel");
			}
			System.out.println(h);
			
			
		}
		
		List<Hotel> listaHo23 = this.hotelService.buscarHotelOuterRightJoin();
		for (Hotel h : listaHo23) {
			System.out.println(h);
		}
		
		List<Habitacion> listaHabi = this.hotelService.buscarHabitacionOuterLeftJoin();
		for (Habitacion ha : listaHabi) {
			System.out.println(ha);
		}
		
		List<Hotel> listaHotel0 = this.hotelService.buscarHotelJoinWhere();
		for (Hotel h : listaHotel0) {
			
			if(h== null) {
				System.out.println("No existe aun un hotel");
			}
			System.out.println(h);
			
			
		}
		

	}

}
