package day2;

import java.util.Scanner;

public class PalindromeStringUsingRecursion {

	boolean isPlaindrome(String str,int i) {
		
		if(i>str.length()/2) 
			return true;
		
		return str.charAt(i)==str.charAt(str.length()-i-1)  && isPlaindrome(str, i+1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PalindromeStringUsingRecursion obj = new PalindromeStringUsingRecursion();
		
		System.out.println("Enter the String to check for Plaindrome");
		String str=sc.next();
		
		if(obj.isPlaindrome(str, 0)) {
			System.out.println("String is Plaindrome");
		}else {
			System.out.println("String is not Plaindrome");
		}
		
		sc.close();
	}
	
	
}
