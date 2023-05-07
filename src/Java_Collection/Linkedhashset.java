package Java_Collection;

import java.util.*;

public class Linkedhashset {
	public static void main(String [] args) {
		
		LinkedHashSet set1 = new LinkedHashSet();  // Heterogeneous
		
		
		set1.add(2);
		set1.add(3.14);
		set1.add("Java");
		
		System.out.println(set1);
		
		for (Object i:set1) {
			System.out.println(i);
		}
		
		LinkedHashSet <Integer> set2 = new LinkedHashSet<Integer>();  // Homogeneous
		
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(2); //Duplicates Not Allowed in Set
		
		System.out.println(set1);
		
		for (Object i:set2) {
			System.out.println(i);
		}
		
	}
}
