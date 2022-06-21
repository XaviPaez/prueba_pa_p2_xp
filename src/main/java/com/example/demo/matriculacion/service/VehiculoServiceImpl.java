package com.example.demo.matriculacion.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacion.modelo.Vehiculo;
import com.example.demo.matriculacion.repository.IVehiculoRepository;

@Service
public class VehiculoServiceImpl implements IVehiculoService{

	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	
	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.insertar(v);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepository.buscar(placa);
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.actualizar(v);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.eliminar(placa);
	}

	@Override
	public BigDecimal calcularMatricula(Vehiculo precio) {
		// TODO Auto-generated method stub
		return null;
	}

}
