package exception;

public class String_Length_Example {
	
	int getStringLength(String s) throws NullPointerException {
		if(s==null) {
			throw new NullPointerException("String is null...Null String is not allowed");
		}
		return s.length();
	}
	
	void stringOperation(String s) {
		
		System.out.println(getStringLength(s));
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String_Length_Example s = new String_Length_Example();
		
		System.out.println("India");
		System.out.println("Java");
		
		s.stringOperation("Java");
		try {
		s.stringOperation(null);
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		//System.out.println(null);
		
		System.out.println("America");
		System.out.println("Laptop");
		
	}

}
