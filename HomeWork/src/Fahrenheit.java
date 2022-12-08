import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double far,cel;
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit : ");
		far=sc.nextDouble();
		cel=((far-32)*5)/9;
		
		System.out.println("Temperature in Celsius is "+cel);
		
		sc.close();
	}

}
