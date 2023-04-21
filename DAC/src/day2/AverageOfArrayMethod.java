package day2;

import java.util.Scanner;

public class AverageOfArrayMethod {

	Scanner sc = new Scanner(System.in);
	
	public static int averageArray(int arr[]) {
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		int avg=sum/arr.length;
		System.out.println(avg);
		
		return avg ;
	
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		AverageOfArrayMethod obj = new AverageOfArrayMethod();
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int arr[] = new int [size];
		System.out.println("Enter the elements of array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		AverageOfArrayMethod.averageArray(arr);
		
	}

}
