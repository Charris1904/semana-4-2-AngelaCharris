package com.ucreativa;

public class Main {

	public static void main(String[] args) {
		
		//Instancias
		Profesor profe = new Profesor("Olman", 30, "123456789", "olman@ucreativa.com", 8, 123.45);
		Estudiante estudiante = new Estudiante("Angela", 30, "123456789", 4, "Informatica", 123456789);
		Vehiculo vehiculo = new Vehiculo(4, 2, 25000000);
		Coche carro = new Coche(4, 2, 6000000, 2021, 1500, "4x4");
		Bicicleta bici = new Bicicleta(2, 0, 1000000, "MTB", 25, "Rojo");
		Vegetal vegetal = new Vegetal("Camote", "Tuberculo", "Rosado");
		Arbol arbol = new Arbol("Mango", "Fructifero", "Verde", "Fruta", "Mango", 123.5);
		Arbusto arbusto = new Arbusto("Musgo", "Arbusto", "Verde", "Atributo 1", "Atributo 2", "Atributo 3");
		
		//Cambio de estado
		profe.setExperiencia(10);
		estudiante.setCarrera("Mecanica");
		vehiculo.setPrecio(8500000);
		carro.setModelo(2022);
		bici.setColor("Verde");
		vegetal.setNombreVegetal("Papa dulce");
		arbol.setNombreCientifico("Mangueos");
		arbusto.setAtributoArbusto2("Atributo Dos");
		
		//Llamar metodo
		System.out.println("************** Llamar Metodos **************");
		profe.revisarTarea();
		estudiante.tomarNota();
		vehiculo.apagar();
		carro.bloquearPuertas();
		bici.pedalear();
		vegetal.mostrarse();
		arbol.desaparecer();
		arbusto.florecer();
		
		//Imprimir estado
		System.out.println("\n************** Imprimir Estados **************");
		System.out.println(profe.toString());
		System.out.println(estudiante.toString());
		System.out.println(vehiculo.toString());
		System.out.println(carro.toString());
		System.out.println(bici.toString());
		System.out.println(vegetal.toString());
		System.out.println(arbol.toString());
		System.out.println(arbusto.toString());
		
		//Polimorfismo
		System.out.println("\n************** Polimorfismo **************");
		Persona poliEstudiante = new Estudiante("Marcela", 25, "123456789", 2, "Ingles", 123456789);
		Persona poliProfesor = new Profesor("Roberto", 29, "098765432", "roberto@ucreativa.com", 15, 234.56);
		poliEstudiante.saludar();
		poliProfesor.saludar();
		
		Vegetal poliArbol = new Arbol("Manzana", "Fructifero", "Rojo", "Fruits", "Apple", 123.5);
		Vegetal poliArbusto = new Arbusto("Laurel", "Arbusto", "Blanco", "Atributo 1", "Atributo 2", "Atributo 3");
		poliArbol.mostrarse();
		poliArbusto.mostrarse();
		
		Vehiculo poliBici = new Bicicleta(3, 0, 1500000, "Triciclo", 20, "Negro");
		Vehiculo poliCoche = new Coche(4, 7, 18500000, 2022, 2300, "4x4");
		poliBici.pitar();
		poliCoche.pitar();
	}

}
