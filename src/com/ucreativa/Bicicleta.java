/**
 * 
 */
package com.ucreativa;

/**
 * @author achar
 *
 */
public class Bicicleta extends Vehiculo {

	public String tipo;
	public int tamano;
	public String color;

	public Bicicleta(int numeroLlantas, int numeroPuertas, int precio, String tipo, int tamano, String color) {
		super(numeroLlantas, numeroPuertas, precio);
		this.tipo = tipo;
		this.tamano = tamano;
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//************************** Metodos de Clase
	public void pedalear() {
		System.out.println("Pedalear Bicicleta");
	}
	
	public void hacerCambio() {
		System.out.println("Hacer Cambio Bicicleta");
	}
	
	public void frenar() {
		System.out.println("Frenar Bicicleta");
	}

	@Override
	public String toString() {
		return "--- Bicicleta --- \nTipo=" + tipo + "\nTamano=" + tamano + "\nColor=" + color + "\nNumero Llantas="
				+ numeroLlantas + "\nNumero Puertas=" + numeroPuertas + "\nPrecio=" + precio + "\n";
	}
}
