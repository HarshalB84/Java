import java.util.Scanner;

public class Degree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double cel,far;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in Celsius : ");
		cel=sc.nextDouble();
		far=(cel*9/5)+32;
		
		System.out.println("Temperature in Fahrenheit is "+far);
		
		sc.close();
	}

}
