package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.modelo.Transferencia;
import com.example.demo.service.AlumnoService;
import com.example.demo.service.CuentaBancariaService;
import com.example.demo.service.IHotelService;
import com.example.demo.service.MatriculaService;
import com.example.demo.service.TransferenciaService;

@SpringBootApplication
public class Pa2U3P4CbDbApplication implements CommandLineRunner {

	@Autowired
	private IHotelService hotelService;

	@Autowired
	private MatriculaService matriculaService;

	@Autowired
	private AlumnoService alumnoService;
	
	@Autowired
	private CuentaBancariaService cuentaBancariaService;
	
	@Autowired
	private TransferenciaService transferenciaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P4CbDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

				
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println(this.cuentaBancariaService.buscar("2205166714"));
		
		System.out.println(this.cuentaBancariaService.buscar("4176615022"));	
		
		System.out.println("--------------------------------------------------------------------------------------------");
		
	
		
		transferenciaService.hacerTransferencia("2205166714", "4176615022", new BigDecimal(100));
		
		
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println(this.cuentaBancariaService.buscar("2205166714"));
		
		System.out.println(this.cuentaBancariaService.buscar("4176615022"));	
		
		

	}

}
