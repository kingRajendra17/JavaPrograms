import java.util.*;

public class Hashset {

	public static void main(String [] args) {
		HashSet<String> name = new HashSet<String>();
		
		name.add("Raj");
		name.add("Raju");
		name.add("Kasi");
		name.add("Raju"); // Duplicate Element Not Printed
		name.add("Durgas");
		
		Iterator<String> itr = name.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}
}
