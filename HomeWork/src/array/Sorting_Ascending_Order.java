package array;

import java.util.Arrays;

public class Sorting_Ascending_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {11,54,6,5,85,25,325,45,54};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
