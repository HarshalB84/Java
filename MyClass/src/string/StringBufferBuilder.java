package string;

import java.util.Scanner;

public class StringBufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sbf1=new StringBuffer();
		sbf1.ensureCapacity(50);
		System.out.println(sbf1.capacity());
		
		String s="Java Language";

		StringBuffer sbf = new StringBuffer("Java Language");
		System.out.println(sbf.capacity());
		System.out.println(sbf.length());
		
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter a string : ");
		 * String s1=sc.next(); sbf.append(s1);
		 */
		
		System.out.println(sbf); 
		
	}

}
