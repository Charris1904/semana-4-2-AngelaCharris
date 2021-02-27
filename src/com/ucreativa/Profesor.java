/**
 * 
 */
package com.ucreativa;

/**
 * @author achar
 *
 */
public class Profesor extends Persona {

	public String correo;
	private int experiencia;
	private double salario;
		
	public Profesor(String nombrePersona, int edad, String identificacion, String correo, int experiencia, double salario) {
		super();
		super.nombrePersona = nombrePersona;
		super.identificacion = identificacion;
		super.edad = edad;
		this.correo = correo;
		this.experiencia = experiencia;
		this.salario = salario;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//************************** Metodos de Clase
	public void ensenar() {
		System.out.println("Enseñar Profesor");
	}
	
	public void planear() {
		System.out.println("Planear Profesor");
	}
	
	public void revisarTarea() {
		System.out.println("Revisar Tarea Profesor");
	}

	@Override
	public String toString() {
		return "--- Profesor --- \nCorreo=" + correo + "\nExperiencia=" + experiencia + "\nSalario=" + salario + "\nNombre Persona="
				+ nombrePersona + "\nIdentificacion=" + identificacion + "\nEdad=" + edad + "\n";
	}
}
