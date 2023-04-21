package day2;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array : ");
		int size =sc.nextInt();
		
		String arr[] = new String[size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next();
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
