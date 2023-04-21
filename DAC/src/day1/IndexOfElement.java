package day1;

import java.util.Scanner;

public class IndexOfElement {

	public static void main(String[] args) {

		//find the index of an array element value
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int a=sc.nextInt();
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==a) {
				System.out.println("Index is : "+i);
			}
		}
		
	}

}
