/**
 * 
 */
package com.ucreativa;

/**
 * @author achar
 *
 */
public abstract class Persona implements Actor {

	protected String nombrePersona;
	protected String identificacion;
	protected int edad;

	//************************** Metodos de Clase Actor
	@Override
	public void actuar() {
		System.out.println("Actuar Persona");
	}
	
	@Override
	public void divertir() {
		System.out.println("Divertir Persona");
	}
	
	@Override
	public void desaparecer() {
		System.out.println("Desaparecer Persona");
	}
	
	//************************** Metodos de Clase Persona
	public void saludar() {
		System.out.println("Saludar Persona " + nombrePersona + " Edad " + edad + " Identificacion " + identificacion);
	}
	
	public void despedirse() {
		System.out.println("Despedir Persona");
	}
	
	public void comer() {
		System.out.println("Comer Persona");
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombrePersona + ", identificacion=" + identificacion + ", edad=" + edad + "]";
	}
}
