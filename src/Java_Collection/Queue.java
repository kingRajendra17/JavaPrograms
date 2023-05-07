package Java_Collection;

import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue(); // Queue allows only Homogeneous Data

		q.add(1);
		q.add(2);
		q.add(3);
		q.offer(4);

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
