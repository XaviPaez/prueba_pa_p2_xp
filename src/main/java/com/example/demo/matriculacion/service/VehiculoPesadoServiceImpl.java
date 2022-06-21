package com.example.demo.matriculacion.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacion.modelo.Vehiculo;
@Service
@Qualifier("pesado")
public class VehiculoPesadoServiceImpl implements IVehiculoService {

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
		BigDecimal matriculaP=precio.getPrecio().multiply(new BigDecimal(0.12));
		return matriculaP;
	}

}
