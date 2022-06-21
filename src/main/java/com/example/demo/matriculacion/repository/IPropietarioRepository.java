package com.example.demo.matriculacion.repository;

import com.example.demo.matriculacion.modelo.Propietario;

public interface IPropietarioRepository {

	public void crear(Propietario p);

	public void eliminar(String apellido);
}
