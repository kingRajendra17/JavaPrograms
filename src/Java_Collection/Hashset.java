package Java_Collection;

import java.util.HashSet;

public class Hashset {

	public static void main(String [] args) {
		
		//Homogeneous
		HashSet set1 = new HashSet();
		
		set1.add(5);
		set1.add("Hello");
		set1.add(2.14);
		set1.add(null);
		
		System.out.println(set1);
		
		for (Object i:set1) {
			System.out.println(i);
		}
	}
}
