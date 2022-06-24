package com.example.demo.matriculacion.service;

import com.example.demo.matriculacion.modelo.Propietario;

public interface IPropiertarioService {

	public Propietario consultar(String cedula);
	public void crear(Propietario propietario);
	public void eliminar(String cedula);
}
