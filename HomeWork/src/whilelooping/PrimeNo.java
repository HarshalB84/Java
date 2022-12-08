package whilelooping;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=300,i=1,coFactor=0;

		for(int j=num;j<=400;j++) {
		while(num > 0 ) {
			if(num%i==0)
				coFactor++;
				i++;
		}
		}
		if(coFactor==2) {
			System.out.println("Number is prime");
			System.out.println(num+" ");
		}else {
			System.out.println("Number is not prime");
		}
	}
	
	
}
