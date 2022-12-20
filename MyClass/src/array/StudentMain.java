package array;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Student stud[] = new Student[10];
		
		
		stud[0]= new Student(101,"Raj","Mechanical",85);
		stud[1]= new Student(102,"Swaraj","Computer",68);
		stud[2]= new Student(103,"Rahul","Civil",72);
		stud[3]= new Student(104,"Aman","Computer",92);
		stud[4]= new Student(105,"Nikita","EnTC",45);
		stud[5]= new Student(106,"Anjali","Computer",78);
		stud[6]= new Student(107,"Swarali","Computer",88);
		stud[7]= new Student(108,"Nishant","Civil",62);
		stud[8]= new Student(109,"Tanmay","Mechanical",65);
		stud[9]= new Student(110,"Akash","Electronics",47);
		
		
		for(Student s : stud) {
			System.out.println(s);
		}
		
		sc.close();
	}

}
