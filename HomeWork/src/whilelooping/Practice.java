package whilelooping;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter a number : ");
//		int num=sc.nextInt();
		int a1=0,a2=1;
		
		
		for(int i=1;i<=10;i++) {
			
			System.out.print(a1+" ");
			int a3=a1+a2;
			a1=a2;
			a2=a3;
			
		
			
		}
		
		
		
		
		

	}

}
