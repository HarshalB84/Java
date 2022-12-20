package overriding;

public class DoctorPersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Doctor d = new Doctor();

		System.out.println("----*Doctor Details *----" );
		d.setName("Rubel");
		d.setAge(25);
		d.setGender("Male");
		d.setContact(854127);
		d.setId(105);
		d.setSpecialisation("Radiology");
		d.setLicence(8754692);
		
		d.display();
		
		System.out.println("----*Patient Details *----" );
		Patient p = new Patient();
		p.setName("Aftab");
		p.setAge(29);
		p.setGender("Male");
		p.setContact(8745215);
		p.setId(125);
		p.setDisease("Tuberculosis");
		p.setBedno(65);
		
		p.display();
	}

}
