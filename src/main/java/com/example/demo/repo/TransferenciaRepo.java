package com.example.demo.repo;

import java.util.List;

import com.example.demo.repo.modelo.Transferencia;

public interface TransferenciaRepo {

	public void insertar (Transferencia transferencia);
	
	public List<Transferencia> seleccionar (String numero);
	
	
}
