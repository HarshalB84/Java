import java.util.Scanner;

public class CubeOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,cube;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number whose cube is to be found : ");
		a=sc.nextInt();
		cube = a*a*a;
		
		System.out.println("Cube of the number is "+cube);
		
		sc.close();
		
	}

}
