/**
 * 
 */
package com.ucreativa;

/**
 * @author achar
 *
 */
public class Estudiante extends Persona {

	public int annoCarrera;
	public String carrera;
	private int carnet;
	
	public Estudiante(String nombrePersona, int edad, String identificacion, int annoCarrera, String carrera, int carnet) {
		super();
		super.nombrePersona = nombrePersona;
		super.identificacion = identificacion;
		super.edad = edad;
		this.annoCarrera = annoCarrera;
		this.carrera = carrera;
		this.carnet = carnet;
	}

	public int getAnnoCarrera() {
		return annoCarrera;
	}

	public void setAnnoCarrera(int annoCarrera) {
		this.annoCarrera = annoCarrera;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getCarnet() {
		return carnet;
	}

	public void setCarnet(int carnet) {
		this.carnet = carnet;
	}
	
	//************************** Metodos de Clase
	public void estudiar() {
		System.out.println("Estudiar Estudiante");
	}
	
	public void tomarNota() {
		System.out.println("Tomar Nota Estudiante");
	}
	
	public void hacerTarea() {
		System.out.println("Hacer Tarea Estudiante");
	}

	@Override
	public String toString() {
		return "--- Estudiante --- \nannoCarrera=" + annoCarrera + "\ncarrera=" + carrera + "\ncarnet=" + carnet
				+ "\nnombrePersona=" + nombrePersona + "\nidentificacion=" + identificacion + "\nedad=" + edad + "\n";
	}

	//************************** Metodos de Actor
	@Override
	public void actuar() {
		System.out.println("Actuar Estudiante");
	}

	@Override
	public void divertir() {
		System.out.println("Divertir Estudiante");
	}

	@Override
	public void desaparecer() {
		System.out.println("Desaparecer Estudiante");
	}

	//************************** Metodos de Persona
	@Override
	public void saludar() {
		System.out.println("Saludar Estudiante >> " + toString());
	}

	@Override
	public void despedirse() {
		System.out.println("Despedirse Estudiante");
	}

	@Override
	public void comer() {
		System.out.println("Comer Estudiante");
	}
}
