package com.example.demo.matriculacion.service;

import java.math.BigDecimal;

public interface IFachadaCalculoMatriculaService {

	public BigDecimal calcularMatricula(String tipo);
	public void crearMatricula(String placa, String cedula);
}
