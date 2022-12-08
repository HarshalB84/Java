package whilelooping;

import java.util.Scanner;

public class AutomorphicNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,sqr=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it is automorphic or not : " );
		a=sc.nextInt();
		
		System.out.println("Square root of number is : "+(a*a));
		while(a !=0) {
			int r = a%10;
			sqr = sqr+r;
			r=r/10;
		}
		System.out.println("Automorphic No ");
		/*if(sqr==a) {
			System.out.println("Automorphic");
		}*/
		sc.close();
	}

}
