package array;

import java.util.Arrays;

public class ReverseArrayInArrayItself2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {3, 90, 45, 29, 37, 78};
		
		int n=arr.length;
		int mid=n/2;
		
		for(int i=0;i<mid;i++) {
			int temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
		}
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
