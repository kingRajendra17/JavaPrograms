package Java_Collection;

import java.util.*;
import java.util.Hashtable;
import java.util.Map.Entry;

public class Hashtables {
	
	public static void main(String[] args) {
		
		Hashtable<Integer, String> m1 = new Hashtable<Integer, String>();
		
		m1.put(101, "Raj");
		m1.put(102, "Endra");
		//m1.put(103, null);  // Null in not allowed in Hash table
		
		System.out.println(m1);
		
		Set s1 = m1.entrySet();
		
		Iterator itr = s1.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
	}

}
