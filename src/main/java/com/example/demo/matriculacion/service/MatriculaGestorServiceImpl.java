package com.example.demo.matriculacion.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacion.modelo.Matricula;
import com.example.demo.matriculacion.modelo.Propietario;
import com.example.demo.matriculacion.modelo.Vehiculo;
import com.example.demo.matriculacion.repository.IMatriculaRepository;
import com.example.demo.matriculacion.repository.IPropietarioRepository;
import com.example.demo.matriculacion.repository.IVehiculoRepository;

@Service

public class MatriculaGestorServiceImpl implements IMatriculaGestorService {
	@Autowired
	private IPropietarioRepository iPropietarioRepository;
	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	@Autowired
	@Qualifier("pesado")
	private IMatriculaService iMatriculaServiceP;
	@Autowired
	@Qualifier("liviano")
	private IMatriculaService iMatriculaServiceL;
	@Autowired
	private IMatriculaRepository iMatriculaRepository;

	@Override
	public void generar(String cedula, String placa) {
		// TODO Auto-generated method stub
		Propietario propietario = this.iPropietarioRepository.consultar(cedula);
		Vehiculo vehiculo = this.iVehiculoRepository.buscar(placa);
		String tipo = vehiculo.getTipo();
		BigDecimal valorMatricula;
		if (tipo.equals("P")) {
			valorMatricula = this.iMatriculaServiceP.calcular(vehiculo.getPrecio());
		} else {
			valorMatricula = this.iMatriculaServiceL.calcular(vehiculo.getPrecio());
		}
		if (valorMatricula.compareTo(new BigDecimal(20000)) > 0) {
			BigDecimal valorDescuento = valorMatricula.multiply(new BigDecimal(7)).divide(new BigDecimal(100));
			valorMatricula = valorMatricula.subtract(valorDescuento);
		}
		Matricula matricula = new Matricula();
		matricula.setFechaMatricula(LocalDateTime.now());
		matricula.setValorMatricula(valorMatricula);
		matricula.setPropietario(propietario);
		matricula.setVehiculo(vehiculo);
		this.iMatriculaRepository.crear(matricula);
	}

}
