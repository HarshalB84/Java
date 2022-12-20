package containment;

public class PersonIdProof1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IdProof1 i = new IdProof1();
		
		i.setNumber(25);
		i.setName("MG");
		i.setAddress("ABC Street");
		
		PersonClass1 p = new PersonClass1();
		
		p.setName("Sameer");
		p.setAge(29);
		p.setContact(87654);
		p.setI(i);
		
		
		
		System.out.println(p.getName()+" "+p.getAge()+" "+p.getContact()+" "+p.getI().getNumber()+" "+p.getI().getName()+" "+p.getI().getAddress());
		
	}

}
