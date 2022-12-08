import java.util.Scanner;
public class SquareOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,sqr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of which square is to be found : ");
		a=sc.nextInt();
		sqr=a*a;
		
		System.out.println("Square of number is "+sqr);
		
		sc.close();
		
	}

}
