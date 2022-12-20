package inheritance;

import java.util.Scanner;

public class Student extends Person{
	
	Scanner sc = new Scanner(System.in);
	
	int percent ;
	String college, grade;
	
	void percent() {
		System.out.println("Please enter percentage");
		percent=sc.nextInt();
	}
	
	void college() {
		System.out.println("KDK College");
	}
	
	void grade() {
		if(percent>=80) {
			System.out.println("A Grade");
		}
		else if(percent>=60) {
			System.out.println("B Grade");
		}
		else if(percent>=40) {
			System.out.println("C Grade");
		}
		else {
			System.out.println("Fail");
		}
			
	}
	

}
