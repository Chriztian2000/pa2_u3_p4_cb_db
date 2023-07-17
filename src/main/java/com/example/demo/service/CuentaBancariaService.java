package com.example.demo.service;

import java.util.List;

import com.example.demo.repo.modelo.CuentaBancaria;

public interface CuentaBancariaService {
	
	public void guardarCta (CuentaBancaria cuentaBancaria);
	public List<CuentaBancaria> buscar (String numero);
	public void modificar (CuentaBancaria cuentaBancaria);

}
