package whilelooping;

import java.util.Scanner;

public class TableOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,r=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number whose table you want to display: ");
		num=sc.nextInt();
		
		while(r <= 10) {
			System.out.println(num+" * "+ r + " = "+num*r);
			r++;
		}
			
		
		sc.close();

	}

}
