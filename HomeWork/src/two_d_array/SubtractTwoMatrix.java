package two_d_array;

import java.util.Scanner;

public class SubtractTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= new int [3][3];
		int b[][]= new int [3][3];
		int c[][]= new int [3][3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter elements of 1st matrix : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=sc.nextInt();
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
		
		System.out.println("Enter elements of 2nd matrix : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				b[i][j]=sc.nextInt();
				System.out.print(b[i][j]+" ");
			}System.out.println(); 
		}
		
		System.out.println("Subtraction of two matrix is : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+" ");
			}System.out.println();
		}
		
		sc.close();
	}

}
