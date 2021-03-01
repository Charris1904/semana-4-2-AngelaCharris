/**
 * 
 */
package com.ucreativa;

/**
 * @author achar
 *
 */
public class Arbusto extends Vegetal implements Actor {

	public String atributoArbusto1;
	public String atributoArbusto2;
	public String atributoArbusto3;

	public Arbusto(String nombre, String tipo, String color, String atributoArbusto1, String atributoArbusto2,
			String atributoArbusto3) {
		super(nombre, tipo, color);
		this.atributoArbusto1 = atributoArbusto1;
		this.atributoArbusto2 = atributoArbusto2;
		this.atributoArbusto3 = atributoArbusto3;
	}

	//************************** Metodos de Interfaz Actor
	@Override
	public void actuar() {
		System.out.println("Actuar Arbusto");
	}
	
	@Override
	public void divertir() {
		System.out.println("Divertir Arbusto");
	}
	
	@Override
	public void desaparecer() {
		System.out.println("Desaparecer Arbusto");
	}
	
	//************************** Metodos de Clase padre Vegetal
	@Override
	public String getNombreVegetal() {
		return super.getNombreVegetal();
	}
	
	@Override
	public void setNombreVegetal(String nombre) {
		super.setNombreVegetal(nombre + " >> Vegetal");
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
		System.out.println("Aparecio Arbusto");
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
		return "--- Arbusto --- \nAtributo Arbusto 1=" + atributoArbusto1 + "\nAtributo Arbusto 2=" + atributoArbusto2
				+ "\nAtributo Arbusto 3=" + atributoArbusto3;
	}

	public String getAtributoArbusto1() {
		return atributoArbusto1;
	}

	public void setAtributoArbusto1(String atributoArbusto1) {
		this.atributoArbusto1 = atributoArbusto1;
	}

	public String getAtributoArbusto2() {
		return atributoArbusto2;
	}

	public void setAtributoArbusto2(String atributoArbusto2) {
		this.atributoArbusto2 = atributoArbusto2;
	}

	public String getAtributoArbusto3() {
		return atributoArbusto3;
	}

	public void setAtributoArbusto3(String atributoArbusto3) {
		this.atributoArbusto3 = atributoArbusto3;
	}
	
	//************************** Metodos de Clase Arbusto
	public void metodoArbusto1() {
		System.out.println("Metodo 1 Arbusto");
	}
	
	public void metodoArbusto2() {
		System.out.println("Metodo 2 Arbusto");
	}
	
	public void metodoArbusto3() {
		System.out.println("Metodo 3 Arbusto");
	}
}
