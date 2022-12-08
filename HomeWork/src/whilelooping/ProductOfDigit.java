package whilelooping;

import java.util.Scanner;

public class ProductOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,pro=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num=sc.nextInt();
		
		while(num!=0) {
			int r = num%10;
			pro=pro*r;
			num=num/10;
			
		}
		
		System.out.println("Product of number is : "+pro);
		
		sc.close();

	}

}
