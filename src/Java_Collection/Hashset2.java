package Java_Collection;

import java.util.HashSet;

public class Hashset2 {

	public static void main(String [] args) {
		
		//Heterogeneous
		HashSet <Integer> set1 = new HashSet<Integer>();
		
		set1.add(5);
		set1.add(7);
		set1.add(9);
		set1.add(10);
		
		System.out.println(set1);
		
		for (Object i:set1) {
			System.out.println(i);
		}
		
        HashSet <Integer> set2 = new HashSet<Integer>();
		
		set2.add(2);
		set2.add(8);
		set2.add(11);
		set2.add(17);
		
		System.out.println(set2);
		
		for (Object i:set2) {
			System.out.println(i);
		}
		
		set1.addAll(set2);
		System.out.println("Union : " +set1);    // Union 
		
		set1.retainAll(set2);
		System.out.println("Intersection : " +set1);    // Intersection
		
		set1.containsAll(set2);
		System.out.println("Subset : " +set1);     // Subset
		
	}
}
