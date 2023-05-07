package Java_Collection;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {

		ArrayList arr = new ArrayList();  // Heterogeneous (Different DataTypes can we add)

		arr.add("Hello");
		arr.add(2);
		arr.add(2.14);
		arr.add(20.14);
		
		System.out.println("Before : " +arr);
		System.out.println("Size of arr : " +arr.size());
		
		
		arr.add(2,4);
		System.out.println("After Add : " +arr);
		System.out.println("Contains Welcome in arr : " +arr.contains("Welcome"));
		System.out.println("Get at index 3 : " +arr.get(3));
		
		arr.remove(1);
		
		// For Each
		System.out.println("For Each :");
		for (Object i : arr) {
			System.out.println(i);
		}
		
		//For Loop
		System.out.println("For Loop :");
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		arr.removeAll(arr);
		System.out.println("After : " +arr);
	}

}
