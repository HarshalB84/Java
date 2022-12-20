package arraycontainment;

import java.util.Arrays;

public class Company {

	private int id;
	private String name;
	private Department dept[];
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department[] getDept() {
		return dept;
	}
	public void setDept(Department[] dept) {
		this.dept = dept;
	}
	
	
	public String toString() {
		return id+" "+name+" "+Arrays.toString(dept)+"\n";
	}
	
}
