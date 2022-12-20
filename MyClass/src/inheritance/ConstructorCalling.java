package inheritance;

class A 
{
	A()
	{
		System.out.println("Inside Class A Constructor");	
	}
	
}
class B extends A
{
	B(int a)
	{
		System.out.println("Inside Class B Constructor");
	}
}
class C extends B
{
	C()
	{
		super(10);
		System.out.println("Inside Class C constructor");
	}
}

public class ConstructorCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c = new C();
		System.out.println(c);
		
		
	}

}
