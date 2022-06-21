package com.example.demo.matriculacion.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacion.modelo.Vehiculo;
import com.example.demo.matriculacion.repository.IVehiculoRepository;
@Service
@Qualifier("liviano")
public class FachadaCalcularMatriculaServiceImpl implements IFachadaCalculoMatriculaService {

	@Autowired
	private IVehiculoService iVehiculoService;
	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	@Autowired
	private IVehiculoService iVehiculoServiceP;
	
	@Override
	public BigDecimal calcularMatricula(String placa) {
		// TODO Auto-generated method stub
		BigDecimal matricula=null;
		Vehiculo vehiculo=this.iVehiculoRepository.buscar(placa);
		if(vehiculo.getTipo().equals("L")) {
			matricula=this.iVehiculoService.calcularMatricula(vehiculo);
		}else {
			matricula=this.iVehiculoServiceP.calcularMatricula(vehiculo);
		}
		return matricula;
		
		
	}

	@Override
	public void crearMatricula(String placa, String cedula) {
		// TODO Auto-generated method stub
		
	}
	

}
