package arrayofobjects;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp[]= new Employee[3];
		
		Scanner sc = new Scanner(System.in);
		
		emp[0]=new Employee(105,"Raj",45000);
		emp[1]=new Employee(108,"Nikhil",65000);
		emp[2]=new Employee(110,"Saurabh",35000);
		
		for(Employee e: emp) {
			if(e.salary>40000)
			System.out.println(e);
		}
		
		sc.close();
	}

}
