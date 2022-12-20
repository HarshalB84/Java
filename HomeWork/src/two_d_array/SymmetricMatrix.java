package two_d_array;

import java.util.Scanner;

public class SymmetricMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of rows : ");
		int r=sc.nextInt();
		System.out.println("Enter the no of column : ");
		int c=sc.nextInt();
		
		
		int a[][]= new int [r][c]; 
		
		System.out.println("Enter the elements : ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				a[i][j]=sc.nextInt();
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
		
		int b[][]= new int [c][r];
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				b[i][j]=a[j][i];
			}
		}
		int flag=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[j][i]==b[i][j]) {
					flag++;
				}
			}
		}
		
		if(flag==9) {
			System.out.println("Symmetric Matrix");
		}else {
			System.out.println("Not Symmetric");
		}
		
		sc.close();
	}

}
