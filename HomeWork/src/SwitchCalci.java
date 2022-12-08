import java.util.Scanner;

public class SwitchCalci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		int sum,sub,mul,div;
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the Operation ypu want to perform : 1.Addition"
				+ " 2.Subtraction"
				+ " 3.Multiplication" + " 4.Division");
		c=sc.nextInt();
		switch(c) {
		
		case 1 : System.out.println("Enter two numbers : ");
				 a=sc.nextInt();
				 b=sc.nextInt();
				 sum=a+b;
				 System.out.println("Addition of two numbers is "+sum);
				 break;
				
		case 2 : System.out.println("Enter two numbers : ");
				 a=sc.nextInt();
				 b=sc.nextInt();
				 sub=a-b;
				 System.out.println("Subtraction of two number is "+sub);
				 break;
				 
		case 3 : System.out.println("Enter two numbers : ");
				 a=sc.nextInt();
				 b=sc.nextInt();
				 mul=a*b;
				 System.out.println("Multiplication of two number is "+mul);
				 break;
				 
		case 4 : System.out.println("Enter two numbers : ");
				 a=sc.nextInt();
				 b=sc.nextInt();
				 div=a/b;
				 System.out.println("Division of two numbers is "+div);
				 break;
				 
		default : System.out.println("Invalid operation !!!"); 
		
		}
		
		sc.close();
	}

}
