package com.example.demo.matriculacion.modelo;

public class Matricula {

	private String placa;
	private String cedula;

	@Override
	public String toString() {
		return "Matricula [placa=" + placa + ", cedula=" + cedula + "]";
	}

	// SET Y GET

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

}
