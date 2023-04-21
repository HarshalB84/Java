package assignment2_java_methods;

import java.util.Scanner;

//1.	Create a class called Emp with data members empno, empname, designation, dept and salary and methods 
// as readEmpData() (to read  values to data members) and 
// displayEmpData() (to display data members values to the screen) 
// create an employee instance and display its information.

public class Employee {

	Scanner sc = new Scanner(System.in);
	
	int empno;
	String empname,designation,dept;
	float salary;
	
	
	void readEmpData(){
		
		System.out.println("Enter emp id : ");
		int empno=sc.nextInt();
		System.out.println("Enter name : ");
		String empname=sc.next();
		System.out.println("Ente rdesignation : ");
		String designation=sc.next();
		System.out.println("Enter department : ");
		String dept=sc.next();
		System.out.println("Enter salary : "); 
		float salary=sc.nextFloat();
	}	
	
	void displayEmpData() {
		
		System.out.println("Employee id : "+empno);
		System.out.println("Employee name : "+empname);
		System.out.println("Employee designation : "+designation);
		System.out.println("Employee department : "+dept);
		System.out.println("Employee salary : "+salary);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee obj = new Employee();
		
		obj.readEmpData();
		obj.displayEmpData();
		
		

	}

}
