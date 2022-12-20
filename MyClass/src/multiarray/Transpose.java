package multiarray;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int r=3,c=3;
		Scanner sc= new Scanner(System.in);
		int a[][]=new int[r][c];
		System.out.println("Enter the array Elements: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		int b[][]= new int[c][r];
		
		for(int i=0;i<c;i++)   //row
		{
			for(int j=0;j<r;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		
		for(int i=0;i<c;i++)   //row
		{
			for(int j=0;j<r;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
		
		

	}


