package set1;

import java.util.Arrays;
import java.util.Scanner;

//1 1 3 1 3 3 1 3
//3 1 5 1 5 3 3 3
//1 3 3 3 3 5 1 5
//3 3 5 3 5 5 3 5

public class TrialAndError2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr1row=4;
		int arr1col=2;
	
		int arr2row=4;
		int arr2col=2;
		
		
		int arr1 [][] = {{1,3,5},{1,3,1},{3,3,3}};
		int arr2 [][] = {{1,3,1},{5,5,1},{3,5,3}};
		
		int count=0;
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				for(int k=0;k<arr2.length;k++) {
					for(int l=0;l<arr2.length;l++) {
						if(arr1[i]==arr2[k]) {
							count++;
						}
					}
				}
			}
		}
		
		System.out.println(count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	int arr1[][] = new int [row][col];
		
	/*	for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr1[i][j]+" ");
			}System.out.println();
		}

		int arr2[][] = new int [row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
	*/
		
		
		
		
		
	}
	
}
