import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s1,s2,s3,s4,s5,total;
		float avg,per;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of first subjects : ");
		s1=sc.nextInt();
		System.out.println("Enter the marks of second subjects : ");
		s2=sc.nextInt();
		System.out.println("Enter the marks of third subjects : ");
		s3=sc.nextInt();
		System.out.println("Enter the marks of fourth subjects : ");
		s4=sc.nextInt();
		System.out.println("Enter the marks of fifth subjects : ");
		s5=sc.nextInt();
		total=s1+s2+s3+s4+s5;
		avg=total/5;
		per=(total*100)/500;
		
		System.out.println("Total of five subjects : "+total);
		System.out.println("Average of five subjects : "+avg);
		System.out.println("Percentage = "+per);
		
		sc.close();
	}

}
