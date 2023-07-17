package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.CuentaBancariaRepo;
import com.example.demo.repo.modelo.CuentaBancaria;

@Service
public class CuentaBancariaServiceImpl implements CuentaBancariaService {

	@Autowired
	private CuentaBancariaRepo cuentaBancariaRepo;

	@Override
	public void guardarCta(CuentaBancaria cuentaBancaria) {
		this.cuentaBancariaRepo.insertar(cuentaBancaria);

	}

	@Override
	public List<CuentaBancaria> buscar(String numero) {
		// TODO Auto-generated method stub
		return this.cuentaBancariaRepo.seleccionar(numero);
	}

	@Override
	public void modificar(CuentaBancaria cuentaBancaria) {
		this.cuentaBancariaRepo.actualizar(cuentaBancaria);
		
	}

}
