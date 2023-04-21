package day3;

import java.util.Scanner;

public class SumOfnNaturalNo {
	
	Scanner sc = new Scanner(System.in);
	
	void sumNatural() {
		
		int sum=0;
		System.out.println("Enter the last term : ");
		int last=sc.nextInt();
		
		for(int i=1;i<=last;i++) {
			sum += i;
		}
		
		System.out.println("Sum of natural number till "+last+" is : "+sum);
	}
	
	void naturalNo(int a) {
		
		System.out.println("Sum is "+(a*(a+1)/2));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numeber : ");
		int last=sc.nextInt();
		
		SumOfnNaturalNo obj = new SumOfnNaturalNo();
		
	//	obj.sumNatural();
		
		obj.naturalNo(last);
		
		
	}

}
