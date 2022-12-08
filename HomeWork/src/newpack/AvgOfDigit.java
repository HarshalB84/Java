package newpack;

import java.util.Scanner;

public class AvgOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,digit=0,count=0;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num=sc.nextInt();
		
		while(num!=0) {
			int r = num%10;  
			digit=digit+r;	 
			num=num/10;
			count++;
		}
		System.out.println("Sum of digit is "+digit);
		System.out.println("Count is "+count);
		avg=digit/count;
		
		System.out.println("Average of digit is "+avg);	
		
		sc.close();	
	}

}
