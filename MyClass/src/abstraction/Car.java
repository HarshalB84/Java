package abstraction;

public abstract class Car {

	int price;
	String engine;
	
	void wheelNo() {
		System.out.println("Every car has 4 wheels...");
	}
	
	void headLightsNo() {
		System.out.println("Every car has 2 headlights...");
	}
	
	abstract void dashboard();
	abstract void safetyFeatures();
	abstract void buildQuality();
	abstract void alloyWheels();
	
}
