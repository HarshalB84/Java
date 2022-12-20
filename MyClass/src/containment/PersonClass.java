package containment;

public class PersonClass {

	int age,contact;
	String name;
	IdProof i;
	
	
	PersonClass(String name,int age,int contact,IdProof i ){
		this.name=name;
		this.age=age;
		this.contact=contact;
		this.i=i;
	}
	
	public String toString() {
		return name+" "+age+" "+contact+" "+i;
	}
	
	
}
