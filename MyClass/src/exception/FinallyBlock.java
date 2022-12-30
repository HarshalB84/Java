package exception;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100,b=5;
		
		try {
			System.out.println("Division : "+(a/b));
		}
		finally {
			System.out.println("Inside finally block");
		}
		System.out.println("Done");
	}

}
