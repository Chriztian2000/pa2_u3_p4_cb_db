package com.example.demo.repo;

import java.util.List;

import com.example.demo.repo.modelo.CuentaBancaria;

public interface CuentaBancariaRepo {
	
	public void insertar (CuentaBancaria cuentaBancaria);
	public List<CuentaBancaria> seleccionar (String numero);
	public void actualizar (CuentaBancaria cuentaBancaria);
	

}
