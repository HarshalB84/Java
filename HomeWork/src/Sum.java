import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();
		sum=a+b;
		
		System.out.println("Sum of two numbers is "+sum);
		
		sc.close();
	}

}
