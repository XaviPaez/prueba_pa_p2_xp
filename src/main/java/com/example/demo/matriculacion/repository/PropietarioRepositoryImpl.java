package com.example.demo.matriculacion.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculacion.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {

	@Override
	public void crear(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha creado el propietario: " + p);
	}

	@Override
	public void eliminar(String apellido) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el propietario: " + apellido);
	}

}
