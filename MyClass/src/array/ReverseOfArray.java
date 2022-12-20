package array;

import java.util.Arrays;

public class ReverseOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,30,40,50,60};
		
		int n=a.length;
		int mid=n/2;
		
		for(int i=0;i<mid;i++) {
			int temp=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=temp;
		}

		
		System.out.println(Arrays.toString(a));
		
	}

}
