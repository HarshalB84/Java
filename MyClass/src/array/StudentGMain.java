package array;

import java.util.Scanner;

public class StudentGMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		StudentGetter stud[] = new StudentGetter[2];
		
		for(int i=0;i<2;i++) {
			
			System.out.println("Enter the details : ");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			int marks=sc.nextInt();
			
			
			StudentGetter s = new StudentGetter();
			s.setId(id);
			s.setName(name);
			s.setDept(dept);
			s.setMarks(marks);
			
			stud[i]=s;
			
		}
		
		for(StudentGetter s: stud ) {
			System.out.println(s);
		}
		
		sc.close();
	}

}
