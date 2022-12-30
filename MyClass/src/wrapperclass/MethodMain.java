package wrapperclass;

public class MethodMain {

	void display(int a) {
		System.out.println("int");
	}
	void display(Integer a) {
		System.out.println("Integer");
	}
	void display(float a) {
		System.out.println("float");
	}
	void display(Float a) {
		System.out.println("Float");
	}
	void display(Number a) {
		System.out.println("Number");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodMain mm = new MethodMain();
		mm.display(100);
		
	}

}
