package com.example.demo.matriculacion.repository;

import com.example.demo.matriculacion.modelo.Propietario;

public interface IPropietarioRepository {

	public Propietario consultar(String cedula);
	public void crear(Propietario propietario);
	public void eliminar(String cedula);
	
}
