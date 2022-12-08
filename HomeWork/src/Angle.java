import java.util.Scanner;

public class Angle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first angle : ");
		a=sc.nextFloat();
		System.out.println("Enter second angle : ");
		b=sc.nextFloat();
		c=180-a-b;
		
		System.out.println("Third angle is "+c);
		
		sc.close();
	}

}
