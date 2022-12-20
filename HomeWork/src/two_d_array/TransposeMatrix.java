package two_d_array;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no of row : ");
		int r=sc.nextInt();
		System.out.println("Enter the no of coloumn : ");
		int c=sc.nextInt();
		
		int a[][]=new int [r][c];
		System.out.println("Enter the elements : ");
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();	
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
		
		int b[][]=new int [c][r];
		
		for(int i=0;i<c;i++) {
			for(int j=0;j<r;j++) {
				b[i][j]=a[j][i];
			}
		}
		System.out.println();
		for(int i=0;i<c;i++) {
			for(int j=0;j<r;j++) {
				System.out.print(b[i][j]+" ");
			}System.out.println();
		}
		sc.close();
	}

}
