package Java_Collection;

import java.util.*;

public class Linkedqueue {

	public static void main(String[] args) {
		LinkedList q = new LinkedList(); // Linked Queue allows Heterogeneous Data

		q.add(1);
		q.add("Hello");
		q.add(3.14);
		q.offer(44.44);

		System.out.println(q);

		/*
		 * System.out.println(q.element()); // Returns Exception when queue is empty
		 * System.out.println(q.peek());
		 */ // Returns Null when queue is empty

		System.out.println(q.remove()); // Returns Exception when queue is empty
		System.out.println(q.poll()); // Returns Null when queue is empty

		System.out.println(q);
	}

}
