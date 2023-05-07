package Inheritance;


public class Area {
	
	public static void main(String[] args) {
	
	Triangle tri = new Triangle();
	Rectangle rect = new Rectangle();
	
	tri.set_values(10,10);
	rect.set_values(10,10);
	
	System.out.println("Area of Triangle : " +tri.area());
	System.out.println("Area of Rectangle : " +rect.area());
			

}
}
