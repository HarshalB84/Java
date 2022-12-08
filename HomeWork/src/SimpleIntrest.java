import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p,r,t;
		float si;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount : ");
		p=sc.nextInt();
		System.out.println("Enter the Rate : ");
		r=sc.nextInt();
		System.out.println("Enter the time : ");
		t=sc.nextInt();
		si=(p*r*t)/100;
		
		System.out.println("Simple interest = "+si);
		
		sc.close();
		
	}

}
