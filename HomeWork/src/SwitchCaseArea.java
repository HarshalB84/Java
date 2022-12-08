import java.util.Scanner;

public class SwitchCaseArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		double area,r,side,base,height,length,breadth,peri;
		Scanner sc = new Scanner(System.in);
		System.out.println("Select a approriate option ");
		System.out.println("1.Area of Circle "+ "2.Area of Square "+"3.Area of right angled triangle "+"4.Area of rectangle "+"5.Circumference of Circle "+"6.Perimeter of Square ");
		a=sc.nextInt();
		
		switch(a) {
		case 1 :System.out.println("Enter radius of circle : ");
				r=sc.nextDouble();
				area = 3.14*r*r;
				System.out.println("Area of circle is "+area);
				break;
		case 2 :System.out.println("Enter side of square : ");
				side=sc.nextDouble();
				area= side*side;
				System.out.println("Area of square is "+area);
				break;
		case 3 :System.out.println("Enter base of triangle : ");
				base=sc.nextDouble();
				System.out.println("Enter height of triangle : ");
				height=sc.nextDouble();
				area=0.5*base*height;
				System.out.println("Area of right angled triangle is "+area);
				break;
		case 4 :System.out.println("Enter length of rectangle : ");
				length=sc.nextDouble();
				System.out.println("Enter breadth of rectangle : ");
				breadth=sc.nextDouble();
				area=length*breadth;
				System.out.println("Area of rectangle is "+area);
				break;
		case 5 :System.out.println("Enter radius of circle : ");
				r=sc.nextDouble();
				area=2*3.14*r;
				System.out.println("Circumference of circle is "+area);
				break;
		case 6 :System.out.println("Enter side of square : ");
				side=sc.nextDouble();
				peri=4*side;
				System.out.println("Perimeter of square is "+peri);
				break;
		default : System.out.println("Invalid option !!!");		
		
		
		}
		
		sc.close();
	}

}
