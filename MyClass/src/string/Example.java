package string;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st ="Java5Core6Language4";
		char[] str=st.toCharArray();
		System.out.println(Arrays.toString(str));
		
		int sum=0;
		for(int i=0;i<str.length;i++) {
			if(str[i]<65) {
				System.out.println(str[i]);
				sum+=str[i]-48;
			}
		}
		System.out.println("Sum is : "+sum);
	}
}