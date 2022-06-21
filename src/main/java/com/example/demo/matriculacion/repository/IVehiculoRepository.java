package com.example.demo.matriculacion.repository;

import com.example.demo.matriculacion.modelo.Vehiculo;

public interface IVehiculoRepository {

	public void insertar(Vehiculo v);

	public Vehiculo buscar(String placa);

	public void actualizar(Vehiculo v);

	public void eliminar(String placa);

}
