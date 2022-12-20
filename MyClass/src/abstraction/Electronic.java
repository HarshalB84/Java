package abstraction;

public abstract class Electronic {

	int price;
	String color;
	float weight;
	
	void processor() {
		System.out.println("Octa Core Processor");
	}
	
	void semiConductor() {
		System.out.println("Lithium conductor");
	}
	
	abstract void rating();
	abstract void electricConsumption();
	abstract void features();
	
	
	
}
