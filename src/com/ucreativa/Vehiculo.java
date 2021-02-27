/**
 * 
 */
package com.ucreativa;

/**
 * @author achar
 *
 */
public class Vehiculo implements Actor, ObjetoInerte{

	public int numeroLlantas;
	public int numeroPuertas;
	public int precio;

	public Vehiculo(int numeroLlantas, int numeroPuertas, int precio) {
		this.numeroLlantas = numeroLlantas;
		this.numeroPuertas = numeroPuertas;
		this.precio = precio;
	}

	public int getNumeroLlantas() {
		return numeroLlantas;
	}

	public void setNumeroLlantas(int numeroLlantas) {
		this.numeroLlantas = numeroLlantas;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	//************************** Metodos de Interfaz Actor
	@Override
	public void actuar() {
		System.out.println("Actuar Vehiculo");
	}

	@Override
	public void divertir() {
		System.out.println("Divertir Vehiculo");
	}

	@Override
	public void desaparecer() {
		System.out.println("Desaparecer Vehiculo");
	}

	//************************** Metodos de Interfaz Objeto Inerte
	@Override
	public void encender() {
		System.out.println("Recorrer Vehiculo");
	}

	@Override
	public void apagar() {
		System.out.println("Medir Distancia Vehiculo");
	}

	@Override
	public void detener() {
		System.out.println("Girar Vehiculo");
	}

	//************************** Metodos de Clase
	public void girar() {
		System.out.println("Girar Coche");
	}
	
	public void acelerar() {
		System.out.println("Acelerar Coche");
	}
	
	public void pitar() {
		System.out.println("Pitar Coche");
	}
	
	@Override
	public String toString() {
		return "--- Vehiculo --- \nNumero Llantas=" + numeroLlantas + "\nNumero Puertas=" + numeroPuertas + "\nPrecio=" + precio
				+ "\n";
	}
}
