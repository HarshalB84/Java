package whilelooping;

import java.util.Scanner;

public class LcmGcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		int g=0;int lcm;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number whose LCM and HCF to be found : ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		for(int i=1;i<=a;i++) {
			if(a%i==0 && b%i==0) {
				g=i;
			}
			
		}
		lcm=a*b/g;
		System.out.println("HCF of Number is : "+g);
		System.out.println("LCM of Number is : "+lcm);
		sc.close();
	}

}
