package com.prueba.dto;

public class AlumnoDTO {

	private String numeroCuenta;
	private String nombre;
	private String carrera;

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "AlumnoDTO [numeroCuenta=" + numeroCuenta + ", nombre=" + nombre + ", carrera=" + carrera
				+ ", getNumeroCuenta()=" + getNumeroCuenta() + ", getNombre()=" + getNombre() + ", getCarrera()="
				+ getCarrera() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
