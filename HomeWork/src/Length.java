import java.util.Scanner;

public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cm;
		double m,km;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length in cm : ");
		cm=sc.nextInt();
		m=cm/100.0;
		km=cm/100000.0;
		
		System.out.println("Length in meter = "+m);
		System.out.println("Length in kilometer = "+km);
		
		sc.close();
	}

}
