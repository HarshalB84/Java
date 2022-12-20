package containment;

public class PersonIdProof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IdProof i1 = new IdProof(25,"MG House","Abc Street");
		
		PersonClass p = new PersonClass("Sammer",29,875214,i1);
		
		System.out.println(p);
		
	}

}
