import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int radius;
		double area,cir,dia;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle : ");
		radius=sc.nextInt();
		dia=radius/2;
		cir=2*3.14*radius;
		area=3.14*radius*radius;
		
		System.out.println("Diameter of circle is "+dia);
		System.out.println("Circumference of circle is "+cir);
		System.out.println("Area of circle is "+area);
		
		
		sc.close();
	}

}
