package abstraction;

public class Mobile extends Electronic{

	void setData(int price, String color,float weight) {
		this.price=price;
		this.color=color;
		this.weight=weight;
	}
	
	void displayInfo() {
		System.out.println(price+" "+color+" "+weight);
	}
	
	void rating() {
		System.out.println("Rating of mobile "+4.5);
	}
	
	void electricConsumption() {
		System.out.println("It consumes 1 unit per 3 hours");
	}
	
	void features() {
		System.out.println("6 Gb RAM with 64 MP Camera " ); 
	}
	
}
