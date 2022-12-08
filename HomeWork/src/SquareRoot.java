import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a,sqrt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		a=sc.nextInt();
		sqrt=Math.sqrt(a);
		
		System.out.println("Square of the number is "+sqrt);
				
		sc.close();
		
	}

}
