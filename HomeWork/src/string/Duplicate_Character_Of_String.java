package string;

public class Duplicate_Character_Of_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Great responsibility";
		int count=0;
		
		char ch[]= str.toCharArray();
		
		System.out.println("Duplicate character in String : ");
		for(int i=0;i<ch.length;i++) {
			count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j] && ch[i]!=' '){
					count++;
					ch[j]='0';
				}
			}	
		if(count>1 && ch[i] !='0') {
			System.out.print(ch[i]+" ");
		}
		}
		
	}

}
