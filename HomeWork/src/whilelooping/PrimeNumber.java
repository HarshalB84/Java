package whilelooping;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to check it is prime or not : ");
		int a = sc.nextInt();
		
		
		for(int i=1;i<a;i++) {
			int j;
			int mid=a/2;
			for(j=2;j<=mid;j++) {
				if(a%j==0) {
					break;
				}
				
			}
			if(j>mid) {
				System.out.print(j+" ");
			}
		}
		
		
		sc.close();

	}

}
