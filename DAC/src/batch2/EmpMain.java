package batch2;

import java.util.ArrayList;

public class EmpMain {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<>();
		
		Employee e1 = new Employee(1, "Harshal", 70000);
		Employee e2 = new Employee(2, "Saurabh", 65000);
		Employee e3 = new Employee(3, "Atif", 50000);
		Employee e4 = new Employee(4, "Shan", 62000);
		Employee e5 = new Employee(5, "Nathan", 35000);
		
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		
		for(Employee list : al) {
			System.out.println(list);
		}
		

	}

}
