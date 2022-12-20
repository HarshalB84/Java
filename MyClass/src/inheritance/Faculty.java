package inheritance;

public class Faculty extends Person{

	double salary;
	String subject;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	void PfCalculate() {
		double pf = (salary*15)/100;
		System.out.println("PF is :"+(salary-pf));
	}
	
	
}
