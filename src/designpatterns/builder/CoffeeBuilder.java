package designpatterns.builder;

public class CoffeeBuilder extends StarbucksBuilder {

	public String cofeeBuilderAtributo1;
	public String cofeeBuilderAtributo2;
	public String cofeeBuilderAtributo3;

	public CoffeeBuilder() {}
	
	public CoffeeBuilder(Starbucks starbucks, String atributoStarbucksBuilder1, String atributoStarbucksBuilder2,
			String atributoStarbucksBuilder3, String cofeeBuilderAtributo1, String cofeeBuilderAtributo2,
			String cofeeBuilderAtributo3) {
		super(starbucks, atributoStarbucksBuilder1, atributoStarbucksBuilder2, atributoStarbucksBuilder3);
		this.cofeeBuilderAtributo1 = cofeeBuilderAtributo1;
		this.cofeeBuilderAtributo2 = cofeeBuilderAtributo2;
		this.cofeeBuilderAtributo3 = cofeeBuilderAtributo3;
	}

	public String getCofeeBuilderAtributo1() {
		return cofeeBuilderAtributo1;
	}

	public void setCofeeBuilderAtributo1(String cofeeBuilderAtributo1) {
		this.cofeeBuilderAtributo1 = cofeeBuilderAtributo1;
	}

	public String getCofeeBuilderAtributo2() {
		return cofeeBuilderAtributo2;
	}

	public void setCofeeBuilderAtributo2(String cofeeBuilderAtributo2) {
		this.cofeeBuilderAtributo2 = cofeeBuilderAtributo2;
	}

	public String getCofeeBuilderAtributo3() {
		return cofeeBuilderAtributo3;
	}

	public void setCofeeBuilderAtributo3(String cofeeBuilderAtributo3) {
		this.cofeeBuilderAtributo3 = cofeeBuilderAtributo3;
	}

	public void coffeeBuilderMetodo1() {
		System.out.println("Coffee Builder Metodo 1");
	}

	public void coffeeBuilderMetodo2() {
		System.out.println("Coffee Builder Metodo 2");
	}

	public void coffeeBuilderMetodo3() {
		System.out.println("Coffee Builder Metodo 3");
	}

	@Override
	public String toString() {
		return "CofeeBuilder >> Coffee Builder Atributo 1=" + cofeeBuilderAtributo1 + ", Coffee Builder Atributo 2="
				+ cofeeBuilderAtributo2 + ", Coffee Builder Atributo 3=" + cofeeBuilderAtributo3 + ", Starbucks="
				+ starbucks + ", Atributo 1=" + atributoStarbucksBuilder1
				+ ", Atributo 2=" + atributoStarbucksBuilder2 + ", Atributo 3="
				+ atributoStarbucksBuilder3;
	}

	@Override
	public void createStarbucks() {
		super.createStarbucks();
	}

	@Override
	public void buildSize() {
		super.buildSize();
	}

	@Override
	public void buildDrink() {
		System.out.println("Build Drink Coffee Builder");
	}

	@Override
	public String getAtributoStarbucksBuilder1() {
		return super.getAtributoStarbucksBuilder1();
	}

	@Override
	public void setAtributoStarbucksBuilder1(String atributoStarbucksBuilder1) {
		super.setAtributoStarbucksBuilder1(atributoStarbucksBuilder1);
	}

	@Override
	public String getAtributoStarbucksBuilder2() {
		return super.getAtributoStarbucksBuilder2();
	}

	@Override
	public void setAtributoStarbucksBuilder2(String atributoStarbucksBuilder2) {
		super.setAtributoStarbucksBuilder2(atributoStarbucksBuilder2);
	}

	@Override
	public String getAtributoStarbucksBuilder3() {
		return super.getAtributoStarbucksBuilder3();
	}

	@Override
	public void setAtributoStarbucksBuilder3(String atributoStarbucksBuilder3) {
		super.setAtributoStarbucksBuilder3(atributoStarbucksBuilder3);
	}

	@Override
	public Starbucks getStarbucks() {
		return super.getStarbucks();
	}

	@Override
	public void setStarbucks(Starbucks starbucks) {
		super.setStarbucks(starbucks);
	}

	@Override
	public void metodSBB1() {
		super.metodSBB1();
	}

	@Override
	public void metodSBB2() {
		super.metodSBB2();
	}

	@Override
	public void metodSBB3() {
		super.metodSBB3();
	}
}
