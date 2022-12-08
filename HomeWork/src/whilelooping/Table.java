package whilelooping;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbers whose table you want : ");
		num=sc.nextInt();
		
		
		System.out.println("Table of "+num+" is : ");
		while(i < 10) {
			System.out.println(num+" * "+ i + " = "+num*i);
			i++;
		}
		sc.close();
	}

}
