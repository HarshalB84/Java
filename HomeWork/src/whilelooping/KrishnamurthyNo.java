package whilelooping;

import java.util.Scanner;

public class KrishnamurthyNo {

	public static void main(String[] args) {
		
		int n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		int m=n;
		while(n !=0) {
			int d =n%10;
			int fact=1;
			for(int i=1;i<=d;i++)
				fact = fact *i;
			sum=sum+fact;
			n=n/10;
		}
		if(sum==m)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		sc.close();
	}

}
