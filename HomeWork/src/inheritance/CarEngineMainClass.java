package inheritance;

public class CarEngineMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Engine e1 = new Engine();
		
		e1.setPower(1250);
		e1.setTorque(400);
		e1.setCname("Mercedes");
		
		Car c = new Car();
		c.setId(1001);
		c.setCname("GWagon");
		c.setCompany("Mercedes");
		c.setPrice(12500000);
		c.setE(e1);
		
		
		System.out.println(c.getId()+" "+c.getCname()+" "+c.getCompany()+" "+c.getPrice()+" "+c.getE());
		

	}

}
