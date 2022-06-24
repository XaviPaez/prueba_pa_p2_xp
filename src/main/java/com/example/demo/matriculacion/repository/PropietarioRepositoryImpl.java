package com.example.demo.matriculacion.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculacion.modelo.Propietario;
@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {

	@Override
	public void crear(Propietario propietario) {
		// TODO Auto-generated method stub
		System.out.println("Se crea el propietario: "+ propietario);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se elimina el propietario: "+ cedula);
	}

	@Override
	public Propietario consultar(String cedula) {
		// TODO Auto-generated method stub
		Propietario propietario=new Propietario();
		propietario.setNombre("Xavier");
		propietario.setApellido("Paez");
		propietario.setCedula("123124312");
		propietario.setFechaNacimiento(LocalDateTime.now());
		return propietario;
	}

}
