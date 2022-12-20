package inheritance;

public class AudiMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AudiA6 a = new AudiA6();
		
		a.setPrice("1.4 Cr7");
		a.setEngine("V8");
		a.wheeels();
		a.seats();
		a.bluetooth();
		a.sunroof();
		a.wipers();
		
		System.out.println("\nPrice:"+a.getPrice()+" Engine:"+a.getEngine());

	}

}
