package array;

import java.util.Arrays;

public class SwapArrayProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,7,8};
		
		int n=a.length;
		int mid=n/2;
		
		for(int i=0;i<mid;i++) {
			int temp=a[i];
			a[i]=a[mid+i];
			a[mid+i]=temp;
		}
		
		System.out.println(Arrays.toString(a));
	}

}
