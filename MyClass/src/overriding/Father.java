package overriding;

public class Father extends GrandFather{

	String firstname1;
	
	
	
	public void setFirstname1(String firstname1) {
		this.firstname1=firstname1;
	}
	
	void display() {
		super.display();
		System.out.println(firstname1+" "+super.firstname+" "+GrandFather.lastname);
	}
	
}
