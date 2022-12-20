package overriding;

public class Child extends Father{
	
	String firstname2;
	
	
	public void setFirstname2(String firstname2) {
		this.firstname2=firstname2;
	}

	void display() {
		super.display();
		System.out.println(firstname2+" "+super.firstname1+" "+GrandFather.lastname);
	}
	
}
