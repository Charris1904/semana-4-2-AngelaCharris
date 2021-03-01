package designpatterns.builder;

public class Customer {

	public Customer() {}
	
	public static void main(String[] args) {
		
		//Instancia
		Starbucks starbucks = new Starbucks("XL", "Coffee", "Atributo 1", "SB Atributo 2", " SB Atributo 3");
		Waiter waiter = new Waiter(null, starbucks, "1", "2", "3");
		CoffeeBuilder coffee = new CoffeeBuilder(starbucks, "SBB Atributo 1", "SBB Atributo 2", "SBB Atributo 3", "CB Atributo 1", "CB Atributo 2", "CB Atributo 3");
		TeaBuilder tea = new TeaBuilder(starbucks, "SBB Atributo 1", "SBB Atributo 2", "SBB Atributo 3", "TB Atributo 1", "TB Atributo 2", "TB Atributo 3");
		
		//Cambiar valor
		starbucks.setDrink("Latte");
		waiter.setAtributoWaiter1("Atributo Waiter");
		coffee.setCofeeBuilderAtributo1("Coffee Atributo");
		tea.setTeaBuilderAtributo2("Tea Atributo");
		
		//Llamar metodo
		starbucks.starbucksMetodo1();
		waiter.metodoWaiter2();
		coffee.buildSize();
		tea.createStarbucks();
		
		//Imprimir estado
		System.out.println(starbucks.toString());
		System.out.println(waiter.toString());
		System.out.println(coffee.toString());
		System.out.println(tea.toString());
		
		//Polimorfismo
		StarbucksBuilder poliCoffee = new CoffeeBuilder();
		StarbucksBuilder poliTea = new TeaBuilder();
		poliCoffee.buildDrink();
		poliTea.buildDrink();
	}
}
