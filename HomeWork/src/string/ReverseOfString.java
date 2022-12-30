package string;

public class ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Dilwale Dulaniya Le Jayege";
		
		String reversedStr="";
		
		for(int i=str.length()-1;i>=0;i--) {
			reversedStr = reversedStr + str.charAt(i);
		}
		
		System.out.println(str);
		
		System.out.println(reversedStr);
		
	}

}
