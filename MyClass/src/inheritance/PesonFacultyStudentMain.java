package inheritance;

public class PesonFacultyStudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student();
		
		s.setId(101);
		s.setName("Aryan");
		s.setAge(25);
		s.setContact(879546);
		
		System.out.println(s.getId()+" "+s.getName()+" "+s.getAge()+" "+s.getContact());
	
		s.percent();
		s.college();
		s.grade();
		
		Faculty f = new Faculty();
		
		f.setId(501);
		f.setName("GD");
		f.setAge(35);
		f.setContact(987456);
		
		f.setSalary(50000);
		f.setSubject("Physics");
		System.out.println();
		System.out.println("Teacher details : ");
		System.out.println(f.getId()+" "+f.getName()+" "+f.getAge()+" "+f.getContact()+" "+f.getSubject()+" "+f.getSalary());
		f.PfCalculate();
		
	}

}
