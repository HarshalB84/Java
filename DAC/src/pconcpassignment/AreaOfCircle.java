package pconcpassignment;

import java.util.Scanner;

//Write a program which accepts the radius of a circle from the user and
//compute its area and circumference and display the output.


public class AreaOfCircle {
	
	 void radiusOfCircle(float r) {
		
		float area = 3.14f*r*r;
		System.out.println("Area of circle is : "+area);
		
		float cir = 2*3.14f*r;
		System.out.println("Circumference of circle is : "+cir);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		AreaOfCircle obj = new AreaOfCircle();
		
		System.out.println("Enter the radius : ");
		float radius = sc.nextFloat();
		
		obj.radiusOfCircle(radius);
		
		
	}

}
