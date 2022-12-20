package array;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array : ");
		int size =sc.nextInt();
		
		int arr[]= new int[size];
		
		System.out.println("Enter the elements of array : ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Elements of array are : ");
		
		System.out.println(Arrays.toString(arr));

		sc.close();
	}

}
