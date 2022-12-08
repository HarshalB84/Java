package whilelooping;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		a=sc.nextInt();
		
			for(int i=1;i<=a;i++) {
				fact = fact*i;
			}
		System.out.println("Factorial of the given number is : "+fact);
		sc.close();
	}

}
