import java.util.Scanner;

public class SwitchNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		a=sc.nextInt();
		
		switch(a) {
		case 1 : System.out.println("Number entered is One");
		break;
		case 2 : System.out.println("Number entered is Two");
		break;
		case 3 : System.out.println("Number entered is Three");
		break;
		case 4 : System.out.println("Number entered is Four");
		break;
		case 5 : System.out.println("Number entered is Five");
		break;
		
		default : System.out.println("Enter a valid number !!!! ");
		
		}
		
		sc.close();
	}

}
