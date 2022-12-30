package array;

import java.util.Scanner;

public class FrequencyOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5,2,1,5,2,3,6,4};
		int fre[]=new int [arr.length];
		
		Scanner sc = new Scanner(System.in);
		
		int counted=-1;
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					
					fre[j]=counted;
				}
			}
			if(fre[i]!=counted) {
				fre[i]=count;
			}
			
		}
		
		for(int i=0;i<fre.length;i++) {
			if(fre[i]!=counted) {
				System.out.println("Frequency of "+arr[i]+ " is : "+fre[i]);
			}
		}
		
		
		
		
		
		sc.close();
	}

}
