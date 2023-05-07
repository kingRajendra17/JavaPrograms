import java.util.ArrayList;

public class Arraylist {
	
	public static void main(String [] args) {
			 
	 ArrayList<Integer> myList = new ArrayList<Integer>(5);
	 
	 myList.add(1);
	 myList.add(2);
	 myList.add(3);
	 myList.add(4);
	 myList.add(5);
	 
	 System.out.println("Size of myList Before : " +myList.size());  // Before
	 
	 for (Integer x : myList) {
		 System.out.println(x);
	 }
	  
	 myList.remove(2);  // Remove Element on 2
	 
	 myList.set(1, 6); // Add Element on 1
	 
	 System.out.println("Size of myList After : " +myList.size()); // After
	 
	 for (Integer x : myList) {
		 System.out.println(x);
	 }
   }
}
