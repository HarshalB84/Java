import java.util.Scanner;

public class SwitchMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month number : ");
		a=sc.nextInt();
		
		switch(a) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 : System.out.println("This month has 31 days ");
		break;
		
		case 4 :
		case 6 :
		case 9 :
		case 11 : System.out.println("This month has 30 days ");
		break;
		
		case 2 : System.out.println("This month has 28 days ");
		break;
		
		default : System.out.println("Please enter a valid number !!!");
		
		}
				
		sc.close();
	}

}
