package package1;

public class Test2 extends Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1 t = new Test1();
		
		System.out.println(t.a);
		//System.out.println(t.b); //private cannot be access in subclass of same package
		System.out.println(t.c);
		System.out.println(t.d);
		
	}

}
