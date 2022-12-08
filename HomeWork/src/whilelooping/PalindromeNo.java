package whilelooping;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,rev=0,x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num=sc.nextInt();
		x=num;
		
		while(num!=0) {			
			int r= num%10;		
			rev=rev*10+r;		
			num=num/10;			
			
		}
		if(x==rev) {
			System.out.println("The number is Palindrome");
		}else {
			System.out.println("The number is not Palindrome");
		}
		
		sc.close();
	}

}
