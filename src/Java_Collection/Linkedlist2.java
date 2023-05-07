package Java_Collection;

import java.util.LinkedList;
//import java.util.ListIterator;

public class Linkedlist2 {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

		list.add("Hello");
		list.add("People");

		System.out.println("Created List : " + list);

		/*
		 * for (int i = 0; i < list.size(); i++) { System.out.println(list.get(i)); }
		 */

		/*
		 * for (String i:list) { System.out.println(i); }
		 */

		list.addFirst("Java");
		System.out.println("Added at First : " + list);

		list.addLast("Program");
		System.out.println("Added at Last : " + list);

		/*ListIterator<String> itr = list.listIterator();

		while (itr.hasNext()) {
			System.out.print(itr.next());

			System.out.print(" ");
		}
		System.out.println(" ");

		while (itr.hasPrevious()) {
			System.out.print(itr.previous());

			System.out.print(" ");
		}
		System.out.println(" ");
		*/

		System.out.println("Get First : " + list.getFirst());

		System.out.println("Get Last : " + list.getLast());

		list.removeFirst();
		System.out.println("Removed at First : " + list);

		list.removeLast();
		System.out.println("Removed at Last : " + list);

	}

}
