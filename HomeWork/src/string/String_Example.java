package string;

public class String_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = new String("Java");
		char[] s4=s.toCharArray();
		String s1 = "Language";
		String s2 = "JAVA";
		String s5 = "Copy";
		String s3 = "dog"; 
		
		// Length of String
		System.out.println(s.length());
		
		//concatenationn  of String
		System.out.println(s.concat(" Language"));
		
		//compare two string   -2
		System.out.println(s.compareTo(s1));
		
		//uppercase and lowercase  DOG java
		System.out.println(s2.toLowerCase());
		System.out.println(s3.toUpperCase());
		
		//copy one string to another string   Java
		System.out.println(s5.copyValueOf(s4));
		
		//Split String Hello@World
		
		
	}

}
