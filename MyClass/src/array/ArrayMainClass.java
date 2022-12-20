package array;

import java.util.Scanner;

public class ArrayMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arrays a = new Arrays();
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size : ");
		int size=sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the elements : ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();	
		}
		
		a.addElements(arr);	
		//a.primeElements(arr);
		//a.reverseNumber(arr);
		//a.negativeNumber(arr);
		//a.average(arr);
		
		sc.close();
		
	}

}
