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

	@Override
	public int getNumeroLlantas() {
		return super.getNumeroLlantas();
	}

	@Override
	public void setNumeroLlantas(int numeroLlantas) {
		super.setNumeroLlantas(numeroLlantas);
	}

	@Override
	public int getNumeroPuertas() {
		return super.getNumeroPuertas();
	}

	@Override
	public void setNumeroPuertas(int numeroPuertas) {
		super.setNumeroPuertas(numeroPuertas);
	}

	@Override
	public int getPrecio() {
		return super.getPrecio();
	}

	@Override
	public void setPrecio(int precio) {
		super.setPrecio(precio);
	}

	@Override
	public void actuar() {
		super.actuar();
	}

	@Override
	public void divertir() {
		super.divertir();
	}

	@Override
	public void desaparecer() {
		super.desaparecer();
	}

	@Override
	public void encender() {
		super.encender();
	}

	@Override
	public void apagar() {
		super.apagar();
	}

	@Override
	public void detener() {
		super.detener();
	}

	@Override
	public void girar() {
		super.girar();
	}

	@Override
	public void acelerar() {
		super.acelerar();
	}

	@Override
	public void pitar() {
		System.out.println("Pitar Bicicleta");
	}
}
