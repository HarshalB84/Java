package inheritance;

public class Person {

	int id,age,contact;
	String name;
	Address a;
	
	Person(int id,String name,int age,int contact, Address a){
		
		this.id=id;
		this.name=name;
		this.age=age;
		this.contact=contact;
		this.a=a;
		
	}
	
	public String toString() {
		return id+" "+name+" "+age+" "+contact+" "+a;
	}
}
