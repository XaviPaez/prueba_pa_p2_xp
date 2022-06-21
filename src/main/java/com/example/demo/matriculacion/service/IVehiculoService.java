package com.example.demo.matriculacion.service;

import java.math.BigDecimal;

import com.example.demo.matriculacion.modelo.Vehiculo;

public interface IVehiculoService {

	public void insertar(Vehiculo v);

	public Vehiculo buscar(String placa);

	public void actualizar(Vehiculo v);

	public void eliminar(String placa);
	
	public BigDecimal calcularMatricula(Vehiculo precio);
	
}
