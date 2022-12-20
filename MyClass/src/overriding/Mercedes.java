package overriding;

public class Mercedes extends Car{

	void dashboard() {
		
		System.out.println("Touch Screen");
		super.dashboard();
	}
	
	void enginePower() {
		System.out.println("Has 1190 cc Engine");
	}
	
}
