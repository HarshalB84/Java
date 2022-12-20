package array;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp[]= new Employee[10];
		
		emp[0]= new Employee(101,"Rahul","Developer",65000);
		emp[1]= new Employee(102,"Raj","Manager",165000);
		emp[2]= new Employee(103,"Nikita","Trainee",45000);
		emp[3]= new Employee(104,"Raman","HR",68500);
		emp[4]= new Employee(105,"Nilesh","Sr.Developer",70000);
		emp[5]= new Employee(106,"Abhay","Networking",45800);
		emp[6]= new Employee(107,"Akshay","Marketing",50000);
		emp[7]= new Employee(108,"Priya","HR",58000);
		emp[8]= new Employee(109,"Harshal","Developer",98000);
		emp[9]= new Employee(110,"Nikhil","HR",68000);
		
		for(Employee e : emp) {
			if(e.salary>60000)
			System.out.println(e);
		}
		System.out.println();
		for(Employee e : emp) {
			if(e.dept.equals("HR")) {
				e.hike();
				System.out.println(e);
			}
		}
		
	}

}
