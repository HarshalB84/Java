package whilelooping;

import java.util.Scanner;

public class SumOfOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start , end , sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start and end number : ");
		start=sc.nextInt();
		end=sc.nextInt();
		
		while(start<=end) {
			if(start%2!=0) {
				sum=sum+start;
			}
			start++;
			
			}
		System.out.println(sum);
		sc.close();
		
	}

}
