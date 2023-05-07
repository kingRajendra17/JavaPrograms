package Java_Collection;

import java.util.*;

public class Hashmap {

	public static void main(String[] args) {

		// HashMap m1 = new HashMap();
		Map<Integer, String> m1 = new HashMap();

		m1.put(101, "Raj");
		m1.put(102, "Endra");
		m1.put(103, "King");
		m1.put(101, "Raj"); // Not allowed Duplicate Keys
		m1.put(104, "Endra"); // Allowed Duplicate Values

		for (Object i : m1.keySet()) {
			System.out.println(i + " " + m1.get(i));
		}
		
		/*System.out.println("Keys Before : " + m1.keySet()); // Return Keys
		
		/*m1.replace(101, "Kumar"); // Replace the Value*/
		
		// Entry Methods
		/*for (Map.Entry i : m1.entrySet()) {
			System.out.println(i.getKey() + " " + i.getValue());
		}*/

		/*System.out.println("Values : " + m1.values()); // Return Values

		System.out.println("Value of Key 101 : " + m1.get(101)); // Returns Specific key value

		System.out.println(m1.get(102));

		System.out.println("Keys After : " + m1.keySet());

		System.out.println("Entry Set : " + m1.entrySet());

		/*m1.clear(); //Clear the Map*/

		/*System.out.println("After Clear Method : " + m1.keySet());*/

	}
}
