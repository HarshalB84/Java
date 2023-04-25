package assign4collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Operations {
	
	public void addElement(ArrayList<Integer> list) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the element to be added : ");
		int ele=sc.nextInt();
		
		list.add(ele);
		
	}
	
	public void removeElement(ArrayList<Integer> list) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the element to be removed : ");
		int ele=sc.nextInt();
		
		if(list.contains(ele)) {
			
			int index=list.indexOf(ele);
			list.remove(index);
			
		}
		
		
	}
	
	public void modifyElement(ArrayList<Integer> list) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the position where element should insert : ");
		int pos=sc.nextInt();
		System.out.println("Enter the element to be inserted : ");
		int mod=sc.nextInt();
		
		list.add(pos, mod);
		
	}
	
	public void viewElement(ArrayList<Integer> list ) {
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	}
	
	public void viewParticularElement(ArrayList<Integer> list) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to be view");
		int n=sc.nextInt();
		
		if(list.contains(n)) {
			System.out.println("Element is present ");
			System.out.println(n);
		}else {
			System.out.println("Element not present ");
		}
			
	}
	
	public void sortArray(ArrayList<Integer> list) {
		
		Collections.sort(list);
		System.out.println(list);
	}
	
	
	
	public static void main(String[] args) {
		
		Operations op = new Operations();
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(5);
		al.add(50);
		System.out.println(al);
		
//		op.removeElement(al);
//		op.modifyElement(al);
//		System.out.println(al);
		System.out.println("-------------------------------------------------");
		//System.out.println("Traversing using iterator ");
		//op.viewElement(al);
		//op.viewParticularElement(al);
		op.sortArray(al);
		
		
	}
	
	

}
