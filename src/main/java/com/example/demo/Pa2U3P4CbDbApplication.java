package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.matricula.repo.modelo.Matricula;
import com.example.demo.matricula.service.IAlumnoService;
import com.example.demo.matricula.service.IMateriaService;
import com.example.demo.matricula.service.IMatriculaService;
import com.example.demo.service.IHotelService;

@SpringBootApplication
public class Pa2U3P4CbDbApplication implements CommandLineRunner {

	@Autowired
	private IHotelService hotelService;
	@Autowired
	private IAlumnoService iAlumnoService;

	@Autowired
	private IMateriaService iMateriaService;

	@Autowired
	private IMatriculaService iMatriculaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P4CbDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*
		 * List<Hotel> listaHotel = this.hotelService.buscarHotelInnerJoin(); for (Hotel
		 * h : listaHotel) { System.out.println(h); }
		 * 
		 * /* Materia mate = new Materia(); mate.setNombre("Fisica");
		 * 
		 * Materia mate1 = new Materia(); mate.setNombre("Quimica");
		 * 
		 * Materia mate2 = new Materia(); mate.setNombre("Porgramacion");
		 * this.iMateriaService.ingresar(mate2);
		 * 
		 * Alumno alu = new Alumno(); alu.setNombre("David");
		 * 
		 * Alumno alu1 = new Alumno(); alu1.setNombre("Fernando");
		 * 
		 * Alumno alu2 = new Alumno(); alu2.setNombre("Clare");
		 * this.iAlumnoService.ingresar(alu2);
		 * 
		 * Matricula matri = new Matricula();
		 * 
		 * matri.setFecha(LocalDateTime.now()); matri.setNumero("Matri_1");
		 * matri.setAlumno(alu); matri.setMateria(mate);
		 * 
		 * this.iMatriculaService.ingresar(matri);
		 * 
		 * 
		 * Matricula matri2 = new Matricula();
		 * 
		 * matri2.setFecha(LocalDateTime.now()); matri2.setNumero("Matri_2");
		 * matri2.setAlumno(alu1); matri2.setMateria(mate1);
		 * this.iMatriculaService.ingresar(matri2);
*/
		

		System.out.println("INNER JOIN MATRICULA-MATERIA");
		List<Matricula> listaMatricula = this.iMatriculaService.buscarMatrilaIinnerJoin();
		for (Matricula matri : listaMatricula) {
			System.out.println(matri);
		}

		System.out.println("RIGTH JOIN MATRICULA-MATERIA");
		List<Matricula> listaMatricula2 = this.iMatriculaService.buscarOuterRigthJoin();
		for (Matricula matri : listaMatricula2) {
			System.out.println(matri);
		}

		System.out.println("LEFT JOIN MATRICULA-MATERIA");
		List<Matricula> listaMatricula3 = this.iMatriculaService.buscarOuterLeftJoin();
		for (Matricula matri : listaMatricula3) {
			System.out.println(matri);
		}

		System.out.println("FULL JOIN MATRICULA-MATERIA");
		List<Matricula> listaMatricula4 = this.iMatriculaService.buscarfullJoin();
		for (Matricula matri : listaMatricula4) {
			System.out.println(matri);
			
		}
	
		
		
		System.out.println("FULL JOIN MATRICULA-alumno");
		List<Matricula> listaMatriculaAlum1 = this.iMatriculaService.buscarAlumnoIinnerJoin();
		for (Matricula matri : listaMatriculaAlum1) {
			System.out.println(matri);
		}
		
		System.out.println("RIGTH JOIN MATRICULA-MATERIA");
		List<Matricula> listaMatriculaAlum2 = this.iMatriculaService.buscarAlumnoOuterRigthJoin();
		for (Matricula matri : listaMatriculaAlum2) {
			System.out.println(matri);
		}

		System.out.println("LEFT JOIN MATRICULA-MATERIA");
		List<Matricula> listaMatriculaAlum3 = this.iMatriculaService.buscarAlumnoOuterLeftJoin();
		for (Matricula matri : listaMatriculaAlum3) {
			System.out.println(matri);
		}

		System.out.println("FULL JOIN MATRICULA-MATERIA");
		List<Matricula> listaMatriculaAlum4 = this.iMatriculaService.buscarAlumnofullJoin();
		for (Matricula matri : listaMatriculaAlum4) {
			System.out.println(matri);
		}
		
	
		

	}

}
