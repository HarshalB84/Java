package wrapperclass;

public class WrapperClass_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;
		Integer it = new Integer(i);   //normal boxing
		
		Integer it1 =i;   //auto boxing            primitive type ---> object
		
		Integer it2 = new Integer(i);
		
		System.out.println(it==it2); // checks memory location
		
		System.out.println(it.equals(it2));  //checks content
		
		Integer a = new Integer(1000);
		int t=a.intValue();      // normal unboxing
		int g=a;   // auto unboxing                      object ---> primitive type
		
		

	}

}
