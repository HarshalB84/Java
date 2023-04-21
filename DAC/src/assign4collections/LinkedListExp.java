package assign4collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

//.Implement single linked list(Integer) with following options:
//a. Insert at the beginning. b. Insert at given position. c. Insert after a given node.
//d. Delete at the beginning. e. Delete at given position. f. Delete after a given node.
//g. Reverse the linked list.


public class LinkedListExp {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
		System.out.println(ll);
		
		//insert at begining
		System.out.println("Insert at Begining");
		ll.addFirst(5);
		System.out.println(ll);
		System.out.println("------------------------------------------------");
		//insert at given position
		System.out.println("Insert at given position");
		ll.add(4, 35);
		System.out.println(ll);
		System.out.println("------------------------------------------------");
		//insert after a given node
		System.out.println("Insert after a given node");
		System.out.println("------------------------------------------------");
		//delete at beignning
		System.out.println("Remove first");
		ll.removeFirst();
		System.out.println(ll);
		System.out.println("------------------------------------------------");
		//Remove at given position
		System.out.println("Remove at given position");
		ll.remove(3);
		System.out.println(ll);
		System.out.println("------------------------------------------------");
		
		//Reverse LinkedList
		System.out.println("Reverse LinkedList");
		ListIterator<Integer> itr = ll.listIterator(ll.size());
		while(itr.hasPrevious()) {
			System.out.print(itr.previous()+" ");
		}
		
		
	}

}
