package newpack;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, i=1 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Factors of given number are : ");
		num=sc.nextInt();
		
		while(i<=num) {    			
			if(num%i==0) {
				System.out.println(i+"");
			}++i;
			
		}
	
		sc.close();
	}

}
