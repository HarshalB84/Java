package string;

public class AllOccurenceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  String str="Pneumonoultramicroscopicsilicovolcanoconiosis"; 
		  int i,len;
		  
		  int counter[] = new int [256];
		  len=str.length();
		  
		  for(i=0;i<len;i++) {
			  counter[(int)str.charAt(i)]++;
		  }
		 
		  for(i=0;i<256;i++) {
			  if(counter[i]!=0) {
				  System.out.println((char)i+" ---> "+counter[i]);
			  }
		  }
		
		/*String str="Pneumonoultramicroscopicsilicovolcanoconiosis";
		
		char []ch = str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			int count=0;
			for(int j=i+1;j<str.length();j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='\0';
				}
			}
			if(ch[i]!='\0') {
				System.out.println(ch[i]+"-->"+count);
			}
			
		}
		
		
		*/
		
	}

}
