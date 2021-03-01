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
		return "--- Profesor --- \ncorreo=" + correo + "\nexperiencia=" + experiencia + "\nsalario=" + salario
				+ "\nnombrePersona=" + nombrePersona + "\nidentificacion=" + identificacion + "\nedad=" + edad + "\n";
	}

	//************************** Metodos de Actor
	@Override
	public void actuar() {
		System.out.println("Actuar Profesor");
	}

	@Override
	public void divertir() {
		System.out.println("Divertir Profesor");
	}

	@Override
	public void desaparecer() {
		System.out.println("Desaparecer Profesor");
	}

	//************************** Metodos de Persona
	@Override
	public void saludar() {
		System.out.println("Saludar Profesor >> " + toString());
	}

	@Override
	public void despedirse() {
		System.out.println("Despedirse Profesor");
	}

	@Override
	public void comer() {
		System.out.println("Comer Profesor");
	}
}
