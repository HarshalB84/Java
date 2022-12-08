import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int l,b,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of rectangle : ");
		l=sc.nextInt();
		System.out.println("Enter the breadth of rectangle : ");
		b=sc.nextInt();
		area=l*b;
		
		System.out.println("Area of triangle is : "+area);
		
		sc.close();

	}

}
