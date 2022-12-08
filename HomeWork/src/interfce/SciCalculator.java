package interfce;

public class SciCalculator implements Calculator {

	
	public void addition(int a, int b) {
		System.out.println("Addition is : "+(a+b));
	}

	
	public void substraction(int a, int b) {
		System.out.println("Substraction is : "+(a-b));
	}

	
	public void multiply(int a, int b) {
		System.out.println("Multiplication is : "+(a*b));
		
	}

	
	public void division(int a, int b) {
		System.out.println("Division is : "+(a/b));
		
	}
	
	public void sqrt(int a) {
		System.out.println("Square root is : "+Math.sqrt(a)); 
	}
	
	public void square(int a) { 
		System.out.println("Square is "+(a*a)); 
	}

}
