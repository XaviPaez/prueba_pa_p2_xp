package com.example.demo.matriculacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacion.modelo.Propietario;
import com.example.demo.matriculacion.repository.IPropietarioRepository;

@Service
public class PropietarioServiceImpl implements IPropietarioService {

	@Autowired
	private IPropietarioRepository iPropietarioRepository;
	
	@Override
	public void crear(Propietario p) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.crear(p);
	}

	@Override
	public void eliminar(String apellido) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.eliminar(apellido);
	}

}
