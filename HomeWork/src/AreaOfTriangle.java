import java.util.Scanner;
public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base,height,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base of triangle : ");
		base=sc.nextInt();
		System.out.println("Enter the height of triangle : ");
		height=sc.nextInt();
		area=base*height;
		
		System.out.println("Area of triangle is "+area);
				
		sc.close();

	}

}
