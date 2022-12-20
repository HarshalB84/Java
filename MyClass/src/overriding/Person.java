package overriding;

public class Person {

	int contact,age;
	String name,gender;
	public void setContact(int contact) {
		this.contact = contact;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	void display() {
		System.out.println(name+" "+age+" "+gender+" "+contact);
	}
	
}
