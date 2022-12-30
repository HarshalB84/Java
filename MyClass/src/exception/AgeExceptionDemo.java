package exception;

import java.util.Scanner;

public class AgeExceptionDemo {

	void ageCheck(int age) throws AgeException{
		
		if(age<18){
			throw new AgeException("Age is less...Cannot enter the ride");
		}
		else if(age>60) {
			throw new AgeException("Age is more...Cannot enter the ride");
		}
		else {
			System.out.println("Enjoy your ride...");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AgeExceptionDemo a = new AgeExceptionDemo();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age=sc.nextInt();
		
		
		try {
		a.ageCheck(age);
		}
		catch(AgeException e)
		{
			e.printStackTrace();
		}
		
		
		sc.close();
	}

}
