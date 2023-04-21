package batch2;

import java.util.Scanner;

public class ArithmeticException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two number : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		
		try{
			int c=a/b;
			
		}catch(Exception e) {
			e.getMessage();
			System.out.println("Please enter a valid number ");
		}
		
		System.out.println("Main method end");
		
		
	}
	
	
}
