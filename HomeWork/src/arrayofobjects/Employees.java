package arrayofobjects;

import java.util.Arrays;

public class Employees {

	int id,salary;
	String name;
	Department dept[];
	
	Employees(int id,String name,int salary,Department[] dept){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
	}
	
	public String toString() {
		return id+" "+name+" "+salary+" "+Arrays.toString(dept);
	}
	
}