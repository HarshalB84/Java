package array;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int arr[]= new int [5];
		
		System.out.println("Enter the elements in array : ");
		for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
