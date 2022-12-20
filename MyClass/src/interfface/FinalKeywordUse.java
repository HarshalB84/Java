package interfface;

class A {
	
	final int a=100;
	
// 	If a variable is declared final than the value of the variable is constant.
	
	final void display() {
		System.out.println("Inside display method ");
	}
	
}

// If a method is declared final then it cannot be overridden.

class B extends A{
	
	void display1() {
		System.out.println("Inside B display method ");
	}
	
}

// If a class is declared final then the class cannot be inherited. 

public class FinalKeywordUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B();
		b.display();
		b.display1();
		
		
	}

}
