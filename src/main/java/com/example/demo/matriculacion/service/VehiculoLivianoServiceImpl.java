package com.example.demo.matriculacion.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacion.modelo.Vehiculo;
@Service
@Qualifier("liviano")
public class VehiculoLivianoServiceImpl implements IVehiculoService {

	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal calcularMatricula(Vehiculo precio) {
		// TODO Auto-generated method stub
		
		BigDecimal matricula=precio.getPrecio().multiply(new BigDecimal(0.14));
		System.out.println("Matricula vehiculo Liviano");
		return matricula;
	}

}
