package interfface;

interface C{
	void add(int a,int b);
	void sqrt(int a);
}

interface D{
	void square(int a);
	void sqrt(int a);
	void modulo(int a,int b);
	
}

class ABC implements C,D{

	/*
	 * public void square(int a) { System.out.println("Square is "+(a*a)); }
	 */
	
	public void substract(int a,int b) {
		System.out.println("Substraction is "+(a-b));
	}

	public void add(int a, int b) {
		System.out.println("Addition is : "+(a+b));
	}
	
	public void sqrt(int a) {
		System.out.println("Square root is : "+Math.sqrt(a)); 
	}

	public void square(int a) {
		
	}

	public void modulo(int a, int b) {
		
	}
	
}

class DEF extends ABC implements C,D{
	
	public void modulo(int a,int b) {
		System.out.println("Modulo is "+(a%b));
	}
	public void square(int a) { 
		System.out.println("Square is "+(a*a)); 
	}
	
}

public class MultipleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ABC a = new ABC(); a.add(10, 5); a.square(5); a.sqrt(64);
		 */
		
		DEF d = new DEF();
		
		d.add(10, 20);
		d.sqrt(4);
		d.square(5);
		d.substract(50, 10);
		
		
	}

}
