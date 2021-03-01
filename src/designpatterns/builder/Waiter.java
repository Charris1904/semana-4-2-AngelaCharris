package designpatterns.builder;

public class Waiter {

	public StarbucksBuilder starbucksBuilder;
	public Starbucks starbucks;
	public String atributoWaiter1;
	public String atributoWaiter2;
	public String atributoWaiter3;
	
	public Waiter() {}
	
	public Waiter(StarbucksBuilder starbucksBuilder, Starbucks starbucks, String atributoWaiter1,
			String atributoWaiter2, String atributoWaiter3) {
		super();
		this.starbucksBuilder = starbucksBuilder;
		this.starbucks = starbucks;
		this.atributoWaiter1 = atributoWaiter1;
		this.atributoWaiter2 = atributoWaiter2;
		this.atributoWaiter3 = atributoWaiter3;
	}

	public StarbucksBuilder getStarbucksBuilder() {
		return starbucksBuilder;
	}

	public void setStarbucksBuilder(StarbucksBuilder starbucksBuilder) {
		this.starbucksBuilder = starbucksBuilder;
	}

	public Starbucks getStarbucks() {
		return starbucks;
	}

	public void setStarbucks(Starbucks starbucks) {
		this.starbucks = starbucks;
	}

	public String getAtributoWaiter1() {
		return atributoWaiter1;
	}

	public void setAtributoWaiter1(String atributoWaiter1) {
		this.atributoWaiter1 = atributoWaiter1;
	}

	public String getAtributoWaiter2() {
		return atributoWaiter2;
	}

	public void setAtributoWaiter2(String atributoWaiter2) {
		this.atributoWaiter2 = atributoWaiter2;
	}

	public String getAtributoWaiter3() {
		return atributoWaiter3;
	}

	public void setAtributoWaiter3(String atributoWaiter3) {
		this.atributoWaiter3 = atributoWaiter3;
	}
	
	public void constructStarbucks() {
		System.out.println("Construct Starbucks");
	}
	
	public void metodoWaiter1() {}
	
	public void metodoWaiter2() {}
	
	public void metodoWaiter3() {}

	@Override
	public String toString() {
		return "Waiter >> Starbucks Builder=" + starbucksBuilder + ", Starbucks=" + starbucks + ", Atribut 1="
				+ atributoWaiter1 + ", Atributo 2=" + atributoWaiter2 + ", Atributo 3=" + atributoWaiter3;
	}
}
