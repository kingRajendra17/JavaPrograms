package Java_Collection;

import java.util.LinkedList;

public class Linkedlist {
	
	public static void main(String [] args) {
		
		LinkedList list = new LinkedList();
		
		list.add(2);
		list.add(7);
		list.add(9);
		
		System.out.println("List : " +list);
		
		list.add(1, 3);
		System.out.println("Add : " +list);
		
		list.remove(3);
		System.out.println("Remove : " +list);
		
		System.out.println("Get : " +list.get(0));
		
		list.set(1,4);
		System.out.println("Set : " +list);
	}

}
