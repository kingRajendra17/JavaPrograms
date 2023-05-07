import java.util.LinkedList;

public class Linkedlist {

	public static void main (String [] args) {
		
		LinkedList<String> mylist = new LinkedList<String>();
		
		mylist.add("Raj");
		mylist.add("Endra");
		
		
		for (String x: mylist) {
			System.out.println(x);
		}
		
		System.out.println("Size of mylist : " +mylist.size());
		
		mylist.addLast("Prasad"); // Add String at Last
		
		
		for (String x: mylist) {
			System.out.println(x);
		}
		
		System.out.println("Size of mylist : " +mylist.size());
		
	}
}
