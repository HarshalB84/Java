package day2;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String str=sc.next();
		
		str=str.toLowerCase();
		
		String original=str;
		
		String revString="";
		
		System.out.println(original);
		
		System.out.println("Reverse of String : ");
		for(int i=(str.length()-1);i>=0;--i) {
			revString += str.charAt(i);
		}
		System.out.println(revString);
		
		if(revString.equalsIgnoreCase(original)) {
			System.out.println("String is Plaindrome");
		}else {
			System.out.println("String is not plaindrome");
		}
		
	}
	
}
