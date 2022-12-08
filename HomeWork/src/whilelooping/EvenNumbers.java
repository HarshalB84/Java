package whilelooping;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=229,b=521;
		System.out.println("Odd numbers between 229 & 521 are : ");
		while(a<b) {
			if(a%2 !=0) {
				System.out.print(a+" ");
			}
			a++;
			
		}

	}

}
