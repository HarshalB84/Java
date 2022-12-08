import java.util.Scanner;

public class SwitchCaseOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		a=sc.nextInt();
		
		switch(a%2) {
		
		case 0 : System.out.println("Number is even ");
				break;
				
		case 1 : System.out.println("Number is odd");
				break;
		
		default : System.out.println("Please enter a valid number !!!");		
		}
		
		sc.close();
	}

}
