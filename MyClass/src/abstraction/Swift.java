package abstraction;

public abstract class Swift extends Car{
	
	void setData(String engine,int price) {
		this.engine=engine;
		this.price=price;
	}
	
	void displayInfo() {
		System.out.println(engine+" "+price);
	}
	
	void dashboard() {
		System.out.println("Swift has : AC, Music System, Screen");
	}
	
	void safetyFeatures() {
		System.out.println("Swift has : Airbags, Child lock");
	}
	
	void buildQuality() {
		System.out.println("3 Star");
	}

}
