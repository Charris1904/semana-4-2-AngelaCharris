package designpatterns.builder;

public abstract class StarbucksBuilder {

	public Starbucks starbucks;
	public String atributoStarbucksBuilder1;
	public String atributoStarbucksBuilder2;
	public String atributoStarbucksBuilder3;
	
	public StarbucksBuilder() {}
	
	public StarbucksBuilder(Starbucks starbucks, String atributoStarbucksBuilder1, String atributoStarbucksBuilder2,
			String atributoStarbucksBuilder3) {
		this.starbucks = starbucks;
		this.atributoStarbucksBuilder1 = atributoStarbucksBuilder1;
		this.atributoStarbucksBuilder2 = atributoStarbucksBuilder2;
		this.atributoStarbucksBuilder3 = atributoStarbucksBuilder3;
	}

	public void createStarbucks() {
		System.out.println("Create Starbucks");
	}
	
	public void buildSize() {
		System.out.println("Build Size");
	}
	
	public void buildDrink() {
		System.out.println("Build Drink");
	}

	public String getAtributoStarbucksBuilder1() {
		return atributoStarbucksBuilder1;
	}

	public void setAtributoStarbucksBuilder1(String atributoStarbucksBuilder1) {
		this.atributoStarbucksBuilder1 = atributoStarbucksBuilder1;
	}

	public String getAtributoStarbucksBuilder2() {
		return atributoStarbucksBuilder2;
	}

	public void setAtributoStarbucksBuilder2(String atributoStarbucksBuilder2) {
		this.atributoStarbucksBuilder2 = atributoStarbucksBuilder2;
	}

	public String getAtributoStarbucksBuilder3() {
		return atributoStarbucksBuilder3;
	}

	public void setAtributoStarbucksBuilder3(String atributoStarbucksBuilder3) {
		this.atributoStarbucksBuilder3 = atributoStarbucksBuilder3;
	}

	public Starbucks getStarbucks() {
		return starbucks;
	}

	public void setStarbucks(Starbucks starbucks) {
		this.starbucks = starbucks;
	}
	
	public void metodSBB1() {}
	
	public void metodSBB2() {}
	
	public void metodSBB3() {}

	@Override
	public String toString() {
		return "StarbucksBuilder [starbucks=" + starbucks + ", atributoStarbucksBuilder1=" + atributoStarbucksBuilder1
				+ ", atributoStarbucksBuilder2=" + atributoStarbucksBuilder2 + ", atributoStarbucksBuilder3="
				+ atributoStarbucksBuilder3 + "]";
	}
}
