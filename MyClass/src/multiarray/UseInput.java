package multiarray;

import java.util.Scanner;

public class UseInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int r=3,c=3;
		
		int a[][]=new int [r][c];
		System.out.println("Enter the elements ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
				System.out.print(a[i][j]+" \t");
			}
			System.out.println();
		}
		

		sc.close();
	}

}
