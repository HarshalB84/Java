package two_d_array;

import java.util.Scanner;

public class LowerTriangularMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i>j) {
					sum += a[i][j];
				}
			}
		}
		System.out.println("Sum of lower triangular matrix is : "+sum);
		
		sc.close();
	}

}
