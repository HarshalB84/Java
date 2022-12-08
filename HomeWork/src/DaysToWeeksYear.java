import java.util.Scanner;

public class DaysToWeeksYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int days;
		double year,month,week;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the days : ");
		days=sc.nextInt();
		week=days/7;
		month=days/30;
		year=days/365.0;
		
		System.out.println("Days in week : "+week);
		System.out.println("Days in months : "+month);
		System.out.println("Days in year : "+year);
		
		sc.close();
	}

}
