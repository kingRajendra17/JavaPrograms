package Problems;

//Outer Class
public class Outer { 
	private int num;

	public void setValue(int num) {
		this.num = num;
	}

	public int getValue() {
		return num;
	}

	// Inner Class
	public class Inner {
		public void print() {
			System.out.println("The value of print is: " + num);
		}
	}

	public static void main(String[] args) {
		// Outer Object
		Outer outer = new Outer(); 
		outer.setValue(107);
		
		// Inner Object
		Outer.Inner inner = outer.new Inner(); 
		inner.print();
	}
}


