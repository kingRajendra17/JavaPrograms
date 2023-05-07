import java.util.*;

public class ListIteration {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Raj");
		list.add("Endra");
		list.add("Prasad");

		ListIterator<String> itr = list.listIterator();
		
		while (itr.hasNext()) {
			System.out.print(itr.next());

			System.out.print(" ");
		}
		
		System.out.println(" ");
		
		while (itr.hasPrevious()) {
			System.out.print(itr.previous());

			System.out.print(" ");
		}

	}

}