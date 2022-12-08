package whilelooping;

import java.util.Scanner;

public class NoOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,digit=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num=sc.nextInt();
		
		while(num != 0) {
			num = num/10;
			digit++;
			}
		System.out.println("Number of digit are : "+digit);
			
		sc.close();
	}

}
