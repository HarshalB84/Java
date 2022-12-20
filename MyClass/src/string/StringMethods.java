package string;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Java";
		String s2="Language is Good";
		String s3="java";
		String s4="Java";
		
		String s5=new String("Java");
		
		System.out.println(s1==s5);
		System.out.println(s1.equals(s3));
		//System.out.println(s1.equals(s5));
		//System.out.println(s1.equalsIgnoreCase(s3));
		
		//Concatination 
		//System.out.println(s1+" Core ");
		//System.out.println(s1.concat(" "+s2));
		
		//s1=s1.concat(" Language");
		//System.out.println(s1);
		
		//Comparison compareTo
		
		System.out.println(s1.compareTo(s4));
		// ascii value  -ve   2>1
		//+ve 1>2
		//0  1=2
		
		System.out.println(s1.compareToIgnoreCase("there"));
		
		System.out.println("Char At : "+s2.charAt(7));
		System.out.println("Contains : "+s2.contains("Good"));
		System.out.println("Starts with : "+s2.startsWith("La"));
		System.out.println("Ends with : "+s2.endsWith("ood"));
		System.out.println("Index of : "+s2.indexOf("is"));
		System.out.println("Last index : "+s2.lastIndexOf("g"));
		System.out.println("Replace with : "+s1.replace('a', 'A'));
		
		String s6="Concatination";
		
		System.out.println(s6.substring(7)); //7-till the end
		System.out.println(s6.substring(4,10)); //10-4= 6 characters starting with index 4
		
		System.out.println(s6.toLowerCase());
		System.out.println(s6.toUpperCase());
		
	}

}
