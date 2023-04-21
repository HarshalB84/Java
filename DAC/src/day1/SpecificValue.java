package day1;

import java.util.Scanner;

public class SpecificValue {

	public static void main(String[] args) {
		// test if an array contains a specific value

		Scanner sc = new Scanner(System.in);
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Enter the number to be found : ");
		int a=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==a) {
				System.out.println("Number Present");
			}
			else {
				System.out.println("Not Present");
			}
		}
		
		
	}

}
