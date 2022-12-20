package string;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Java Language";
		char ch='a';
		
		char ch1[]=s.toCharArray();
		int cnt=0;
		
		// using predefine method
		
		for(int i=0;i<ch1.length;i++) {
			if(s.charAt(i)==ch) {
				cnt++;
			}
		}
		System.out.println(ch+" "+cnt);
		
		//using array
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]=='a') {
				ch1[i]='A';
			}
		}
		System.out.println(ch1);
		
		
	}

}
