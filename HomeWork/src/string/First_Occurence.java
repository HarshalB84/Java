package string;

import java.util.Scanner;

public class First_Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		char ch;
		int i,flag=0;
		
		System.out.println("Enter the String : ");
		String firstStr=sc.next();
		
		System.out.println("Enter the first character to found : ");
		ch=sc.next().charAt(0);
		
		for( i=0;i<firstStr.length();i++) {
			if(firstStr.charAt(i)==ch) {
				flag++;
				break;
			}
		}
		
		if(flag==0) {
			System.out.println("Char not Found");
		}else {
			System.out.println("The First Character Occurence of "+ch+" at position is : "+i);
		}
		
		
		
		sc.close();
	}

}
