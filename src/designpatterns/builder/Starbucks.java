package designpatterns.builder;

public class Starbucks {

	public String size;
	public String drink;
	public String atributoStarbucks1;
	public String atributoStarbucks2;
	public String atributoStarbucks3;
	
	public Starbucks(String size, String drink, String atributoStarbucks1, String atributoStarbucks2,
			String atributoStarbucks3) {
		this.size = size;
		this.drink = drink;
		this.atributoStarbucks1 = atributoStarbucks1;
		this.atributoStarbucks2 = atributoStarbucks2;
		this.atributoStarbucks3 = atributoStarbucks3;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public String getAtributoStarbucks1() {
		return atributoStarbucks1;
	}

	public void setAtributoStarbucks1(String atributoStarbucks1) {
		this.atributoStarbucks1 = atributoStarbucks1;
	}

	public String getAtributoStarbucks2() {
		return atributoStarbucks2;
	}

	public void setAtributoStarbucks2(String atributoStarbucks2) {
		this.atributoStarbucks2 = atributoStarbucks2;
	}

	public String getAtributoStarbucks3() {
		return atributoStarbucks3;
	}

	public void setAtributoStarbucks3(String atributoStarbucks3) {
		this.atributoStarbucks3 = atributoStarbucks3;
	}
	
	public void starbucksMetodo1() {
		System.out.println("Starbucks Metodo 1");
	}
	
	public void starbucksMetodo2() {
		System.out.println("Starbucks Metodo 2");
	}
	
	public void starbucksMetodo3() {
		System.out.println("Starbucks Metodo 3");
	}

	@Override
	public String toString() {
		return "Starbucks >> Size=" + size + ", Drink=" + drink + ", Atributo 1=" + atributoStarbucks1
				+ ", Atributo 2=" + atributoStarbucks2 + ", Atributo 3=" + atributoStarbucks3;
	}
}
