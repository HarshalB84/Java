package string;

public class Count_Vowel {

	public static void main(String[] args) {
	
		String st = "This is just an example";
	
		String str=st.toLowerCase();	
		
		int vCount=0,cCount=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' ||str.charAt(i)=='u'){
				vCount++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z') 
			{
				cCount++;
			}
		}
		
		System.out.println("Total number of vowels are : "+vCount);
		System.out.println("Total number of consonant are : "+cCount);

	


	}
}