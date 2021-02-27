/**
 * 
 */
package com.ucreativa;

/**
 * @author achar
 *
 */
public class Vegetal {
	
	private String nombreVegetal;
	private String tipo;
	private String color;
	
	public Vegetal(String nombre, String tipo, String color) {
		this.nombreVegetal = nombre;
		this.tipo = tipo;
		this.color = color;
	}

	public String getNombreVegetal() {
		return nombreVegetal;
	}

	public void setNombreVegetal(String nombre) {
		this.nombreVegetal = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//************************** Metodos de Clase Vegetal
	public void mostrarse() {
		System.out.println("Mostrarse Vegetal");
	}
	
	public void desaparecerVegetal() {
		System.out.println("Desaparecer Vegetal");
	}
	
	public void florecer() {
		System.out.println("Florecer Vegetal");
	}

	@Override
	public String toString() {
		return "--- Vehiculo --- \nNombre Vegetal=" + nombreVegetal + "\nTipo=" + tipo + "\nColor=" + color + "\n";
	}
}
