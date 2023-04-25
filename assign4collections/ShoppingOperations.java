package assign4collections;

import java.util.ArrayList;
import java.util.Scanner;

//Write a Java program to simulate an online shopping cart.

//A shopping cart is a collection of items selected by a customer for purchase. 
//A user can add items to the cart, remove them, empty the cart, view the items in the cart, 
//view the items in the shop, and end shopping and proceed to checkout.(using arraylist) 

//View Items in Shop \n2.Add items to cart \n3.Remove items from cart ");
//System.out.println("4.View items in cart \n5.Empty items from cart \n6.Exit

public class ShoppingOperations {

	Scanner sc = new Scanner(System.in);

	public void viewItems() {

		System.out.println("Items available in store are ");

		System.out.println("Product Name    Price    Availale Quantity");

		System.out.println("GoodDay \t 20     \t 25");
		System.out.println("Maggi   \t 28     \t 25");
		System.out.println("Apple   \t 100    \t 20");
		System.out.println("Peanuts \t 20     \t 78");
		System.out.println("Coke    \t 40     \t 42");
		System.out.println("Juice   \t 35     \t 50");
		
	}

	public void addIteminCart(ArrayList<Cart> al) {
		
		System.out.println("Enter the number of items to be brought : ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter item name : ");
			String name =sc.next();
			System.out.println("Enter the price : ");
			float price=sc.nextFloat();
			System.out.println("Enter the qty : ");
			int qty=sc.nextInt();
			
			al.add(new Cart(name,price,qty));
		}
	}
	
	public void removeAllItemsFromCart(ArrayList<Cart>al) {
		
		System.out.println("Do you want to empty items from cart \nSelect y or n");
		char ch=sc.next().charAt(0);
		
		if(ch=='y' || ch=='Y') {
			al.removeAll(al);
			System.out.println("Cart is empty.. Thank You");
		}else {
			System.out.println("Please continue shopping.");
		}
	}
	
	public void viewItemInCart(ArrayList<Cart>al) {
		
		System.out.println("Items in cart are : ");
		System.out.println(al);
	}
	
	public void removeItemFromCart(ArrayList<Cart>al) {
		
		System.out.println("Enter the number of items to be removed : ");
		int n=sc.nextInt();
		
		Cart c = new Cart() ; 
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the name of item to be removed : ");
			String name = sc.next();
			
			if(name.equalsIgnoreCase(c.name)) {
				al.get(i);
				al.remove(i);
			}
		}
	}
	
	public void billing(ArrayList<Cart>al) {
		
		int sum=0;
		for(Cart c1 : al) {
			float bill=c1.price*c1.qty;
			//System.out.println(bill);
			sum += bill;
		}
		System.out.println("Total Bill is : "+sum);
		
		
	}
	

}