package exception;

public class SimpleException {
	
	void add(int a,int b) {
		System.out.println("Addition is : "+(a+b));
	}
	
	void sub(int a,int b) {
		System.out.println("Subtraction is : "+(a-b));
	}
	
	void mul(int a,int b) {
		System.out.println("Multiplication is : "+(a*b));
	}
	
	void div(int a,int b) {
		System.out.println("Division is : "+(a/b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=150,b=0;
		
		SimpleException e = new SimpleException();
		
		e.add(a, b);
		try {
			e.div(a, b);
		}catch(ArithmeticException e1) {
			System.out.println(e1);
		}
		
		e.mul(a, b);
		e.sub(a, b);
		
		
	}

}
