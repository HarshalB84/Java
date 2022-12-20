package inheritance;

public class FatherSonDaughter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Son s = new Son();
		s.setName("Nihal");
		s.setAge(28);
		
		System.out.println("Son Information :");
		System.out.println(s.getName()+" "+Son.surname+" "+s.getAge());
		s.education();
		s.address();
		
		Daughter d = new Daughter();
		d.setName("Asha");
		d.setAge(25);
		System.out.println();
		

		System.out.println("Daughter Information :");
		System.out.println(d.getName()+" "+Daughter.surname+" "+d.getAge());
		d.education();
		d.address();
		
		
	}

}
