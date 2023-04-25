package assign4collections;

import java.util.ArrayList;
import java.util.Scanner;

//A user can add items to the cart, remove them, empty the cart, view the items in the cart, 
//view the items in the shop, and end shopping and proceed to checkout.(using arraylist) 

public class ShoppingMain {

	public static void main(String[] args) {

		ShoppingOperations sop = new ShoppingOperations();

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Cart> al = new ArrayList<>();

		System.out.println("Welcome to E-mart : ");
		{
			
//			sop.viewItems();
//			sop.addIteminCart(al);
//			System.out.println(al);
//			sop.removeItemFromCart(al);
//			System.out.println(al); 
//			sop.viewItemInCart(al);
//			sop.removeItemFromCart(al);
//			sop.billing(al);
//			System.out.println(al);
//			System.out.println("Please select the following : ");
//			
			char ch = 0;
			
			do{
				
				System.out.println("1.View Items in Shop \n2.Add items to cart \n3.Remove items from cart ");
				System.out.println("4.View items in cart \n5.Empty items from cart \n6.Exit");
				int choice=sc.nextInt();
				 switch(choice) {
				 case 1:
					 sop.viewItems();;
					 break;
				 case 2:
					 sop.addIteminCart(al);
					 break;
				 case 3:
					 sop.removeItemFromCart(al);;
					 break;
				 case 4:
					 sop.viewItemInCart(al);
					 break;
				 case 5:
					 sop.removeAllItemsFromCart(al);
					 break;
					 default: 
						 System.out.println("Billing done");
						
				 }
				
				System.out.println("Do you want to continue : Select y or n");
				ch=sc.next().charAt(0);
				
				
				
			}while(ch=='y' || ch=='Y'); 
			System.out.println("Bill for your purchase:");
				sop.billing(al);
				System.out.println("Thank You and Visit Again");
			
			//sop.viewItems(al);
			
			

		}
		sc.close();

	}
}