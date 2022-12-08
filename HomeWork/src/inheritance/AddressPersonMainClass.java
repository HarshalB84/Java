package inheritance;

public class AddressPersonMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address a1 = new Address("MG Road","Pune","Maharashtra",445665);
		Person p1 = new Person(1001,"Abhay",28,547821,a1);
		
		System.out.println(p1);
		
		
	}

}
