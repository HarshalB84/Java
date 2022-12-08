package whilelooping;

public class PrimeNumberBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		int num=0;
		String primenumbers=" ";
		
		for(i=300;i<=400;i++) 
		{
			int cf=0;
			for(num=i;num>=1;num--) 
			{
				if(i%num==0) 
				{
					cf=cf+1;
				}
			}
			if(cf==2) 
			{
				primenumbers = primenumbers + i + " ";
			}
		}
		System.out.println("Prime number between 300 and 400 are : ");
		System.out.print(primenumbers);
	}

}
