package overriding;

public class GrandFatherChildMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c = new Child();
		
		c.setFirstname("Rajesh");
		c.setMidname("Mukesh");
		c.setFirstname1("Nikhil");
		c.setFirstname2("Raj");
		
		c.display();

	}

}
