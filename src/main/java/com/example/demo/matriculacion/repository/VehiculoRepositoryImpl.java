package com.example.demo.matriculacion.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculacion.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("Se inserta el vehiculo: "+ vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("Se actualiza el vehiculo: "+ vehiculo);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se elimina el vehiculo: "+ placa);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se busca el vehiculo: "+ placa);
		Vehiculo vehiculo=new Vehiculo();
		vehiculo.setMarca("Chevrolet");
		vehiculo.setPlaca("PEA-1231");
		vehiculo.setPrecio(new BigDecimal(9000));
		vehiculo.setTipo("P");
		return vehiculo;
	}

}
