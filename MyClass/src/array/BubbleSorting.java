package array;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,50,20,30,40,60,9,8};
//		char a[]={'a','z','d','f','r'};
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
	}

}
