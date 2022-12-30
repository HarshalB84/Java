package string;

import java.util.Scanner;

public class Count_Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int i,count=0;
		
		System.out.println("Enter the String : ");
		String str=sc.next();
		
		System.out.println("Enter the character to cout :");
		char ch=sc.next().charAt(0);
		
		for(i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
		
		
		sc.close();
	}

}
