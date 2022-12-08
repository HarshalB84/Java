package whilelooping;

import java.util.Scanner;

public class HarshadNo {
	
		public static void main (String [] args) {
			
			int num,temp=0,sum=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number : ");
			num=sc.nextInt();
			temp=num;
			
			while(num !=0) {	    //18
				int r = num%10;		//18/10=8
				sum = sum+r;		//0+8=8
				num = num/10;		//18/10=1	
			}
			num--;
			System.out.println(sum);	//9
			
			if(temp%num==0)
				System.out.println("Yes");
			else
				System.out.println("No");
			
			sc.close();
		}

}
