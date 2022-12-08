package interfce;

public class SmartPhone implements Mobile {

	public void calling() {
		System.out.println("Calling available");
	}

	public void messaging() {
		System.out.println("Texting available"); 
	}

	public void fM() {
		System.out.println("FM available");
	}

	public void ram() {
		System.out.println("6 GB RAM");
	}

	public void calculator() {
		System.out.println("Calculator available");
	}

	public void calander() {
		System.out.println("Calander available");
	}

	public void battery() {
		System.out.println("5000 mAH Battery ");
	}

	public void keypad() {
		System.out.println("Touch Screen");
	}
	
	public void earphone() {
		System.out.println("Earphone socket");
	}
	
	public void chargerType() {
		System.out.println("C type charger");
	}
	
	public void chargr() {
		System.out.println("65 Watt Charger");
	}
	
}