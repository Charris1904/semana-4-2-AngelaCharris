/**
 * 
 */
package com.ucreativa;

/**
 * @author achar
 *
 */
public class Coche extends Vehiculo {

	public int modelo;
	public int cilindrada;
	public String traccion;
	
	public Coche(int numeroLlantas, int numeroPuertas, int precio, int modelo, int cilindrada, String traccion) {
		super(numeroLlantas, numeroPuertas, precio);
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.traccion = traccion;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	//************************** Metodos de Clase
	public void bloquearPuertas() {
		System.out.println("Bloquear Puertas Coche");
	}
	
	public void encenderLuces() {
		System.out.println("Encender Luces Coche");
	}
	
	public void compresionar() {
		System.out.println("Compresionar Coche");
	}

	@Override
	public String toString() {
		return "--- Coche --- \nModelo=" + modelo + "\nCilindrada=" + cilindrada + "\nTraccion=" + traccion + "\nNumero Llantas="
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
		System.out.println("Pitar Coche");
	}
}
