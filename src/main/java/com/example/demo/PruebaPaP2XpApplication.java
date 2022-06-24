package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.matriculacion.modelo.Propietario;
import com.example.demo.matriculacion.modelo.Vehiculo;
import com.example.demo.matriculacion.service.IMatriculaGestorService;
import com.example.demo.matriculacion.service.IPropiertarioService;
import com.example.demo.matriculacion.service.IVehiculoService;

@SpringBootApplication
public class PruebaPaP2XpApplication implements CommandLineRunner {

	@Autowired
	private IVehiculoService iVehiculoService;
	@Autowired
	private IPropiertarioService iPropiertarioService;
	@Autowired
	private IMatriculaGestorService gestorService;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2XpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//1
		Vehiculo vehiculo=new Vehiculo();
		vehiculo.setMarca("Chevrolet");
		vehiculo.setPlaca("PEW-1231");
		vehiculo.setPrecio(new BigDecimal(9000));
		vehiculo.setTipo("L");
		this.iVehiculoService.insertar(vehiculo);
		
		//2
		vehiculo.setPrecio(new BigDecimal(40000));
		vehiculo.setMarca("Toyota");
		this.iVehiculoService.actualizar(vehiculo);
	
		//3
		Propietario pro=new Propietario();
		pro.setApellido("Cayambe");
		pro.setNombre("Edison");
		pro.setCedula("124756345");
		pro.setFechaNacimiento(LocalDateTime.now());
		this.iPropiertarioService.crear(pro);
		
		//4
		this.gestorService.generar("1242141231", "PTR-1234");
		
	}

}
