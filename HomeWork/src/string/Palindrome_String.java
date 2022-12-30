package string;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string="Kayak";
		
		string = string.toLowerCase();
		boolean flag = true;
		
		
		for(int i=0;i<string.length()/2;i++) {
			if(string.charAt(i) != string.charAt(string.length()-i-1)) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
		
		
		
	}

}
