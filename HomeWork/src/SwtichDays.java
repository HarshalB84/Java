import java.util.Scanner;

public class SwtichDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of day in a week : ");
		a=sc.nextInt();
		
		switch(a) {
		case 1 : System.out.println("Day is Monday");
		break;
		case 2 : System.out.println("Day is Tuesday");
		break;
		case 3 : System.out.println("Day is Wednesday");
		break;
		case 4 : System.out.println("Day is Thursday");
		break;
		case 5 : System.out.println("Day is Friday");
		break;
		case 6 : System.out.println("Day is Saturday");
		break;
		case 7 : System.out.println("Day is Sunday");
		break;
		
		default : System.out.println("Error day does not exist  !!!");
		
		}
		
		sc.close();
	}

}
