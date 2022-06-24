package com.example.demo.matriculacion.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculacion.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository {

	@Override
	public void crear(Matricula matricula) {
		// TODO Auto-generated method stub
		System.out.println("Se crea la matricula: " + matricula);
	}

}
