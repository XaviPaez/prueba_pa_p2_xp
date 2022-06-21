package com.example.demo.matriculacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacion.modelo.Matricula;
import com.example.demo.matriculacion.repository.IMatriculaRepository;
@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	@Autowired
	private IFachadaCalculoMatriculaService calculoMatriculaService;
	
	@Override
	public void ingresarMatricula(Matricula matricula) {
		// TODO Auto-generated method stub
		System.out.println("Se ingreso la matricula");
		this.iMatriculaRepository.insertar(matricula);
		
	}

}
