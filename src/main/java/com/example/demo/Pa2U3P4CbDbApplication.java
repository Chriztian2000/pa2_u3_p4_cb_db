package com.example.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.modelo.Alumno;
import com.example.demo.repo.modelo.Matricula;
import com.example.demo.service.AlumnoService;
import com.example.demo.service.IHotelService;
import com.example.demo.service.MatriculaService;

@SpringBootApplication
public class Pa2U3P4CbDbApplication implements CommandLineRunner {

	@Autowired
	private IHotelService hotelService;

	@Autowired
	private MatriculaService matriculaService;

	@Autowired
	private AlumnoService alumnoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P4CbDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("INNER JOIN");
		
		List<Matricula> matriculas = this.matriculaService.buscarMatriculaInnerJoin();
		for (Matricula m : matriculas) {
			System.out.println(m);
		}
		List<Matricula> matriculas1 = this.matriculaService.buscarMatriculaOuterRightJoin();
		for (Matricula m : matriculas1) {
			System.out.println(m);
		}
		List<Matricula> matriculas2 = this.matriculaService.buscarMatriculaOuterLeftrJoin();
		for (Matricula m : matriculas2) {
			System.out.println(m);
		}
		List<Matricula> matriculas3 = this.matriculaService.buscarMatriculaOuterFullJoin();
		for (Matricula m : matriculas3) {
			System.out.println(m);
		}
		List<Matricula> matriculas4 = this.matriculaService.buscarMatriculaOuterJoin();
		for (Matricula m : matriculas4) {
			System.out.println(m);
		}
		
		List<Alumno> alumno = this.matriculaService.buscarAlumnoInnerJoin();
		for (Alumno a : alumno) {
			System.out.println(a);
		}
		List<Alumno> alumno2 = this.matriculaService.buscarAlumnoOuterRightJoin();
		for (Alumno a2 : alumno2) {
			System.out.println(a2);
		}
		List<Alumno> alumno3 = this.matriculaService.buscarAlumnoOuterLeftrJoin();
		for (Alumno a3 : alumno3) {
			System.out.println(a3);
		}
		List<Alumno> alumno4 = this.matriculaService.buscarAlumnoOuterFullJoin();
		for (Alumno a4 : alumno4) {
			System.out.println(a4);
		}
		List<Alumno> alumno5 = this.matriculaService.buscarAlumnoOuterJoin();
		for (Alumno a5 : alumno5) {
			System.out.println(a5);
		}
		
		
		
		
		
	

	}

}
