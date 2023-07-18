package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.modelo.Estudiante;
import com.example.demo.repo.modelo.Provincia;
import com.example.demo.service.CuentaBancariaService;
import com.example.demo.service.EstudianteService;
import com.example.demo.service.IHotelService;
import com.example.demo.service.MateriaService;
import com.example.demo.service.MatriculaService;
import com.example.demo.service.TransferenciaService;

@SpringBootApplication
public class Pa2U3P4CbDbApplication implements CommandLineRunner {

	@Autowired
	private IHotelService hotelService;
	
	@Autowired
	private CuentaBancariaService cuentaBancariaService;
	
	@Autowired
	private TransferenciaService transferenciaService;
	
	@Autowired
	private EstudianteService estudianteService;
	
	@Autowired
	private MateriaService materiaService;
	
	@Autowired 
	private MatriculaService matriculaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P4CbDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Provincia prov=new Provincia();
		prov.setNombre("Pichincha");
		prov.setCanton("Quito");
		prov.setSector("San Juan");
		
		Estudiante estu= new Estudiante();
		estu.setNombre("Christian");
		estu.setApellido("Betancourt");
		estu.setCedula("1722781000");
		estu.setProvincia(prov);
		
		
		
		
		
		
		
		

	}

}
