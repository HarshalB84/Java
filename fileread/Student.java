package fileread;

import java.io.Serializable;

public class Student implements Serializable{

	int id;
	String name;
	float salary;

	Student(int id,String name,float salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString() {
		return id+" "+name+" "+salary;
	}
	
	
}
