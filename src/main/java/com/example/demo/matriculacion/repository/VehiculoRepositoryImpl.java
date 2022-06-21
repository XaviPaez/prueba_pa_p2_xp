package com.example.demo.matriculacion.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculacion.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado el vehiculo:" + v);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado el vehiculo"+ placa);
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setPlaca(placa);
		vehiculo.setTipo("L");
		return vehiculo;

	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el vehiculo: " + v);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el vehiculo: " + placa);
	}

}
