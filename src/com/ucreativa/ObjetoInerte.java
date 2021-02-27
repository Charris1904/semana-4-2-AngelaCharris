/**
 * 
 */
package com.ucreativa;

/**
 * @author achar
 *
 */
public interface ObjetoInerte {
	
	public static final String tipo = "Vehiculo";
	public static final String funcion = "Transportar";
	public static final int annosVidaUtil = 15;
	
	abstract void encender();
	
	abstract void apagar();
	
	abstract void detener();

}
