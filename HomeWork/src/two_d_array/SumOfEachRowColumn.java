package two_d_array;

import java.util.Scanner;

public class SumOfEachRowColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter elements : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=sc.nextInt();
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
		
		
		
		for(int i=0;i<3;i++) {
			int sum=0;
			for(int j=0;j<3;j++) {
				sum=sum+a[i][j];
			}
			System.out.println("Sum is row is "+sum);
		}
		
		for(int i=0;i<3;i++) {
			int sum=0;
			for(int j=0;j<3;j++) {
				sum=sum+a[j][i];
			}
			System.out.println("Sum of coloumn is : "+sum);
		}
		
		sc.close();
	}

}
