import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		int sum,sub,mul,div;
		Scanner sc = new Scanner(System.in);
		System.out.println("Operation you want to perform : ");
		System.out.println("1. Addition " + "2. Subtraction " + "3. Multiplication " + "4. Division ");
		c=sc.nextInt();
		if(c==1) {
		
			System.out.println("Enter two numbers : ");
			a=sc.nextInt();
			b=sc.nextInt();
			sum=a+b;
			System.out.println("Addition of two number is "+sum);
		}
		else if(c==2) {
			System.out.println("Enter two numbers : ");
			a=sc.nextInt();
			b=sc.nextInt();
			sub=a-b;
			System.out.println("Subtraction of two number is "+sub);
			
		}
		else if(c==3) {
			System.out.println("Enter two numbers : ");
			a=sc.nextInt();
			b=sc.nextInt();
			mul=a*b;
			System.out.println("Multiplication of two numbers is "+mul);
		}
		else {
			System.out.println("Enter two numbers : ");
			a=sc.nextInt();
			b=sc.nextInt();
			div=a/b;
			System.out.println("Division of two numbers is "+div);
		}
		
		
		sc.close();
	}

}
