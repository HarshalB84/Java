package overriding;

public class Doctor extends Person{

	int id,licence;
	String specialisation;
	public void setId(int id) {
		this.id = id;
	}
	public void setLicence(int licence) {
		this.licence = licence;
	}
	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}
	
	void display() {
		super.display();
		System.out.println(id+" "+specialisation+" "+licence);
	}
	
}
