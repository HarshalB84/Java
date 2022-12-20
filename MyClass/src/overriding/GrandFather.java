package overriding;

public class GrandFather {

	String firstname,midname;
	static String lastname="Khanna";
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setMidname(String midname) {
		this.midname = midname;
	}
	
	void display() {
		System.out.println(firstname+" "+midname+" "+lastname);
	}
	
	
}
