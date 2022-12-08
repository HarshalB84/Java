package objectsclasses;

import java.util.Scanner;

public class Employee {
	
	int id;
	String name,dept;
	long contact;
	long salary;
	
	void setData(int i,String n,String d,long c,long s) {
	
		id=i;
		name=n;
		dept=d;
		contact=c;
		salary=s;
		
		
	}	
	
	void display(){
		
		System.out.println(id+" "+name+" "+dept+" "+contact+" "+salary);
		
	}
	
	public static void main(String[] args) {
		
		int i;
		String d,n;
		long c,s;
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		System.out.println("Enter id : ");
		i=sc.nextInt();
		System.out.println("Enter name : ");
		n=sc.next();
		System.out.println("Enter department : ");
		d=sc.next();
		System.out.println("Enter salary : ");
		s=sc.nextLong();
		System.out.println("Enter contact : ");
		c=sc.nextLong();
		e.setData(i, n, d, c, s);
		
		Employee e1 = new Employee();
		System.out.println("Enter id : ");
		i=sc.nextInt();
		System.out.println("Enter name : ");
		n=sc.next();
		System.out.println("Enter department : ");
		d=sc.next();
		System.out.println("Enter salary : ");
		s=sc.nextLong();
		System.out.println("Enter contact : ");
		c=sc.nextLong();		
		e1.setData(i, n, d, c, s);
		
		Employee e2 = new Employee();
		System.out.println("Enter id : ");
		i=sc.nextInt();
		System.out.println("Enter name : ");
		n=sc.next();
		System.out.println("Enter department : ");
		d=sc.next();
		System.out.println("Enter salary : ");
		s=sc.nextLong();
		System.out.println("Enter contact : ");
		c=sc.nextLong();
		e2.setData(i, n, d, c, s);
		
		Employee e3=new Employee();
		System.out.println("Enter id : ");
		i=sc.nextInt();
		System.out.println("Enter name : ");
		n=sc.next();
		System.out.println("Enter department : ");
		d=sc.next();
		System.out.println("Enter salary : ");
		s=sc.nextLong();
		System.out.println("Enter contact : ");
		c=sc.nextLong();
		e3.setData(i, n, d, c, s);
		
		Employee e4 = new Employee();
		System.out.println("Enter id : ");
		i=sc.nextInt();
		System.out.println("Enter name : ");
		n=sc.next();
		System.out.println("Enter department : ");
		d=sc.next();
		System.out.println("Enter salary : ");
		s=sc.nextLong();
		System.out.println("Enter contact : ");
		c=sc.nextLong();
		e4.setData(i, n, d, c, s);
		
		e.display();
		e1.display();
		e2.display();
		e3.display();
		e4.display();
		
		sc.close();
	}

}
