package designpatterns.builder;

public class TeaBuilder extends StarbucksBuilder {

	public String teaBuilderAtributo1;
	public String teaBuilderAtributo2;
	public String teaBuilderAtributo3;

	public TeaBuilder() {}
	
	public TeaBuilder(Starbucks starbucks, String atributoStarbucksBuilder1, String atributoStarbucksBuilder2,
			String atributoStarbucksBuilder3, String teaBuilderAtributo1, String teaBuilderAtributo2,
			String teaBuilderAtributo3) {
		super(starbucks, atributoStarbucksBuilder1, atributoStarbucksBuilder2, atributoStarbucksBuilder3);
		this.teaBuilderAtributo1 = teaBuilderAtributo1;
		this.teaBuilderAtributo2 = teaBuilderAtributo2;
		this.teaBuilderAtributo3 = teaBuilderAtributo3;
	}

	public String getTeaBuilderAtributo1() {
		return teaBuilderAtributo1;
	}

	public void setTeaBuilderAtributo1(String teaBuilderAtributo1) {
		this.teaBuilderAtributo1 = teaBuilderAtributo1;
	}

	public String getTeaBuilderAtributo2() {
		return teaBuilderAtributo2;
	}

	public void setTeaBuilderAtributo2(String teaBuilderAtributo2) {
		this.teaBuilderAtributo2 = teaBuilderAtributo2;
	}

	public String getTeaBuilderAtributo3() {
		return teaBuilderAtributo3;
	}

	public void setTeaBuilderAtributo3(String teaBuilderAtributo3) {
		this.teaBuilderAtributo3 = teaBuilderAtributo3;
	}

	public void teaBuilderMetodo1() {
		System.out.println("Tea Builder Metodo 1");
	}
	
	public void teaBuilderMetodo2() {
		System.out.println("Tea Builder Metodo 2");
	}
	
	public void teaBuilderMetodo3() {
		System.out.println("Tea Builder Metodo 3");
	}
	
	@Override
	public String toString() {
		return "TeaBuilder >> Tea Builder Atributo 1=" + teaBuilderAtributo1 + ", Tea Builder Atributo 2=" + teaBuilderAtributo2
				+ ", Tea Builder Atributo 3=" + teaBuilderAtributo3 + ", Starbucks=" + starbucks
				+ ", Atributo 1=" + atributoStarbucksBuilder1 + ", Atributo 2="
				+ atributoStarbucksBuilder2 + ", Atributo 3=" + atributoStarbucksBuilder3;
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
		System.out.println("Build Drink Tea Builder");
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
