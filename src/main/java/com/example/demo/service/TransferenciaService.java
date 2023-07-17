package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repo.modelo.Transferencia;

public interface TransferenciaService {

	public void guardar(Transferencia transferencia);

	public List<Transferencia> mostrar(String numeroCtaOrigen);
	
	public void hacerTransferencia (String ctaOrigen, String ctaDestino, BigDecimal monto);

}
