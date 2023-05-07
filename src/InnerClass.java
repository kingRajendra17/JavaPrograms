class Outer {
	String name = "Raj";
	
	class Inner {
		String name = "Endra";
	}
}


public class InnerClass {
	
	public static void main(String [] args) {
	
	Outer outer = new Outer();
	
	Outer.Inner inner = outer.new Inner();
	
	System.out.print(outer.name + " " + inner.name);

 }

}