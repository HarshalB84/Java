package newpack;

import java.util.Scanner;

public class LowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character : ");
		ch=sc.next().charAt(0);
		
		if(ch>='A' && ch <= 'Z') {
			System.out.println(ch+" is UpperCase");
		}else if (ch >='a' && ch<= 'z') {
			System.out.println(ch+" is LowerCase");
		}else {
			System.out.println("Invalid character");
		}
		
		sc.close();
	}

}
