package day2;

import java.util.Scanner;

public class DoubleAverageMethod {
	
	// public static double average(double[] array).
	
	public static double average(double arr[]){
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		
		int avg=sum/arr.length;
		System.out.println("Average is "+avg);
		
		return avg;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		double arr[] = new double [size];
		System.out.println("Enter the elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextDouble();
		}
		
		DoubleAverageMethod obj = new DoubleAverageMethod();
		
		obj.average(arr);
		
	}

}
