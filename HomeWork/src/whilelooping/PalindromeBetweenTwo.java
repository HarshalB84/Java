package whilelooping;

public class PalindromeBetweenTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,b,rev=0;
		for(int i=100;i<=500;i++) {
			n=i;
			while(n>0) {
				b=n%10;
				rev=rev*10+b;
				n=n/10;
			}
			if(rev==i) {
				System.out.print(i+" ");
			}
			rev=0;
		}
	
	}

}
