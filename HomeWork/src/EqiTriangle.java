import java.util.Scanner;

public class EqiTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double area , a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of equilateral triangle : ");
		a=sc.nextDouble();
		area=0.433*a*a;
		
		System.out.println("Area of equilateral triangle is "+area);
		
		sc.close();
	}

}
