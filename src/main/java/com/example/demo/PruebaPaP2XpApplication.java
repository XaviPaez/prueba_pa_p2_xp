package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.matriculacion.modelo.Vehiculo;
import com.example.demo.matriculacion.service.IVehiculoService;

@SpringBootApplication
public class PruebaPaP2XpApplication implements CommandLineRunner {

	@Autowired
	private IVehiculoService iVehiculoService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2XpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Vehiculo vehiculo=new Vehiculo();
		vehiculo.setMarca("Chevrolet");
		vehiculo.setModelo("Sail");
		vehiculo.setPlaca("PEF-12312");
		//vehiculo.setTipo("L");
		iVehiculoService.insertar(vehiculo);
		
	}

}
