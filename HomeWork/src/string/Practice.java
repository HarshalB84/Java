package string;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		char ch;
		int i,flag=0;
		
		System.out.println("Enter the String : ");
		String str=sc.next();
		
		System.out.println("Enter the element to be found : ");
		ch=sc.next().charAt(0);
		
		for(i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				flag++;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Char not found");
		}else {
			System.out.println(ch+" --> "+i);
		}

	}

}
