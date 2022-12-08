import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int l,b,peri;
		Scanner sc = new Scanner(System.in);
		System.out.println("Length of rectangle : ");
		l=sc.nextInt();
		System.out.println("Breadth of rectangle : ");
		b=sc.nextInt();
		peri=2*(l+b);
		
		System.out.println("Perimeter of rectangle = "+peri);
		
		sc.close();
	}

}
