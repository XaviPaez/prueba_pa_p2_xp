package com.example.demo.matriculacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacion.modelo.Matricula;
import com.example.demo.matriculacion.modelo.Vehiculo;

@Service
@Qualifier("liviano")
public class MatricularVehiculoServiceImpl implements IMatricularVehiculoService {

	@Autowired
	private IFachadaCalculoMatriculaService calculoMatriculaService;
	@Autowired
	private IVehiculoService iVehiculoService;
	@Autowired
	private IPropietarioService iPropietarioService;
	@Autowired
	private IMatricularVehiculoService iMatricularVehiculoService;
	@Autowired
	private IMatriculaService iMatriculaService;
	
	
	
	@Override
	public void crearMatricula(String cedula, String placa) {
		// TODO Auto-generated method stub

		
	
		
	}

}
