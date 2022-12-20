package inheritance;

public class Father {

	String name;
	int age;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	static String surname="Asdf";
	
	void address() {
		System.out.println("Lives in Pune...!!!!");
	}
		
}