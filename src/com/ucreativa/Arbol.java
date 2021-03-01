/**
 * 
 */
package com.ucreativa;

/**
 * @author achar
 *
 */
public class Arbol extends Vegetal implements Actor {

	private String marca; 
	private String nombreCientifico; 
	private double atributo1;

	public Arbol(String nombre, String tipo, String color, String marca, String nombreCientifico, double atributo1) {
		super(nombre, tipo, color);
		this.marca = marca;
		this.nombreCientifico = nombreCientifico;
		this.atributo1 = atributo1;
	}

	//************************** Metodos de Interfaz Actor
	@Override
	public void actuar() {
		System.out.println("Actuar Arbol");
	}

	@Override
	public void divertir() {
		System.out.println("Divertir Arbol");
	}

	@Override
	public void desaparecer() {
		System.out.println("Desaparecer Arbol");
	}

	//************************** Metodos de Clase padre Vegetal
	@Override
	public String getNombreVegetal() {
		return super.getNombreVegetal();
	}

	@Override
	public void setNombreVegetal(String nombre) {
		super.setNombreVegetal(nombre + " >> Arbol");
	}

	@Override
	public String getTipo() {
		return super.getTipo();
	}

	@Override
	public void setTipo(String tipo) {
		super.setTipo(tipo);
	}

	@Override
	public String getColor() {
		return super.getColor();
	}

	@Override
	public void setColor(String color) {
		super.setColor(color);
	}

	@Override
	public void mostrarse() {
		System.out.println("Aparecio Arbol");
	}

	@Override
	public void desaparecerVegetal() {
		super.desaparecerVegetal();
	}

	@Override
	public void florecer() {
		super.florecer();
	}

	@Override
	public String toString() {
		return "--- Arbol --- \nMarca=" + marca + "\nNombre Cientifico=" + nombreCientifico + "\nAtributo 1=" + atributo1 + "\n";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	public double getAtributo1() {
		return atributo1;
	}

	public void setAtributo1(double atributo1) {
		this.atributo1 = atributo1;
	}

	//************************** Metodos de Clase Arbol
	public void florear(String tipoFlor) {
		System.out.println("Florece Arbol " + tipoFlor);
	}
	
	public void metodoArbol1() {
		System.out.println("Metodo 1 Arbol");
	}
	
	public void metodoArbol2() {
		System.out.println("Metodo 2 Arbol");
	}
	
	public void metodoArbol3() {
		System.out.println("Metodo 3 Arbol");
	}
}
