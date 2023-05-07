package Problems;

public class JavaGC {
	
	public static void main(String [] args) {
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		obj1 = null;
		
		// Run Garbage Collector
		System.gc();
		 
		System.out.println(obj2.toString()); //  obj2 has no reference
	}
}
