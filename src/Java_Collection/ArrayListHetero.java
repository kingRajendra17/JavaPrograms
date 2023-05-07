package Java_Collection;

import java.util.ArrayList;

public class ArrayListHetero {

	public static void main(String [] args) {
		
		/*ArrayList <Integer> list = new ArrayList<Integer>();
		
		list.add(2);
		list.add(33);
		list.add(44);
		
		System.out.println(list);
		
		for (Integer i : list) {
		System.out.println(i);
		}	*/
		
       ArrayList <String> list = new ArrayList<String>();
		
		list.add("Hello");
		list.add("Java");
		list.add("Programming");
		list.set(0, "Hai");
		
		System.out.println(list);
		
		for (String i : list) {
		System.out.println(i);
		}  
		
	}
}
