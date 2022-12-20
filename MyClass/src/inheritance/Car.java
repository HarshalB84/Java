package inheritance;

public class Car {

	String price,engine;
	
	
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	void wheeels() {
		System.out.println("Has 4 Wheels....");
	}
	
	void seats() {
		System.out.println("Has 4 seats....");
	}
	
}
