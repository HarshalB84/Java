package array;

import java.util.Arrays;

public class CopyElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {1,2,3,5,4};
		
		int arr2[]= new int [arr1.length];

		for(int i=0;i<arr1.length;i++) {
			arr2[i]= arr1[i];
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
	}

}
