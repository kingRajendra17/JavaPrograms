import java.util.*;


public class SumTwo {
	 
	ArrayList<Integer> number = new ArrayList<Integer>();
	
	
	public void add(Integer a) {
		number.add(a);
	}
	
	public boolean find(Integer a) {
		return number.contains(a);
	}
	              
	public static void main(String []args) {
		SumTwo two = new SumTwo();
		
		two.add(2);
		two.add(5);
		two.add(6);
		two.add(8);
		
		if (two.find(6)) {
			System.out.print("True");
		} else {
			System.out.print("False");
		}
	}
}


