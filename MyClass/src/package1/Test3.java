package package1;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1 t = new Test1(); 
		
		System.out.println(t.a);
	//	System.out.println(t.b); //Private cannot be access in different class of same package
		System.out.println(t.c);
		System.out.println(t.d);
	}

}
