package array;

import java.util.Arrays;

public class SecondMinimumValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {-20, 0, -25, 15, 19, 37, 23};

		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]<a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(a[a.length-2]);
	}

}
