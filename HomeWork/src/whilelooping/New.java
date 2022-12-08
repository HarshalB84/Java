package whilelooping;


public class New {
	public static void main (String[] args){
	
		int num = 1254;
		int sum=1;
		
		while(num >0) {
			int r = num%10;
			sum = sum*r;
			num=num/10;
			
			
			
		}
		System.out.println(sum);
			
		
	   }
}