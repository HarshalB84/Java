package string;

public class SumOfAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		char [] ch =s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=65) {
				System.out.print(ch[i]+" ");
			}
		}
		
	//	int value=1;
		
		
		
	}

}
