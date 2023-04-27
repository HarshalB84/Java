package day2;

import java.util.Scanner;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int arr[][]=new int [3][3];
		int transpose[][] = new int [3][3];
		
		System.out.println("Enter the elements : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Original Matrix : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				transpose[i][j]=arr[j][i];
			}
		}
		
		System.out.println("Transpose of matrix : ");
		for(int i=0;i<transpose.length;i++) {
			for(int j=0;j<transpose.length;j++) {
				System.out.print(transpose[i][j]+" ");
			}System.out.println();
		}
		
		
		sc.close();
	}
	
	
}
