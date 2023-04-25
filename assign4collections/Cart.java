package assign4collections;

public class Cart {

	String name;
	float price;
	int qty;
	
	Cart(){
		
	}
	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	Cart(String name,float price,int qty){
		super();
		this.name=name;
		this.price=price;
		this.qty=qty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name+" "+price+" "+qty;
	}
	
	
}
