package com.example.demo;

import java.math.BigDecimal;
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
		
		Hotel hot1 = new Hotel();
		
		hot1.setDireccion("La Vicentina");
		hot1.setNombre("Vista Al Mar");
		
		Habitacion habi1 = new Habitacion();
		habi1.setNumero("VM1");
		habi1.setValor(new BigDecimal(80));
		habi1.setHotel(hot1);
		
		Habitacion habi2 = new Habitacion();
		habi1.setNumero("VM2");
		habi1.setValor(new BigDecimal(50));
		habi1.setHotel(hot1);
		
		Habitacion habi3 = new Habitacion();
		habi1.setNumero("VM1");
		habi1.setValor(new BigDecimal(40));
		habi1.setHotel(hot1);
		
		this.hotelService.agregar(hot1);
		
		
		
		
		List<Hotel> listaHotel = this.hotelService.buscarHotelInnerJoin();
		for (Hotel h : listaHotel) {
			System.out.println(h.getNombre());
			System.out.println("Tiene las siguientes habitaciones");
			for (Habitacion ha:h.getHabitaciones())
			System.out.println(ha.getNumero());
		}
		
		System.out.println("SQL JOIN FETCH");
		
		List<Hotel> listaHotelF = this.hotelService.buscarFetchJoin();
		for (Hotel h : listaHotelF) {
			System.out.println(h.getNombre());
			System.out.println("FETCH Tiene las siguientes habitaciones");
			for (Habitacion ha:h.getHabitaciones())
			System.out.println(ha.getNumero());
		}
		
		
	}

}
