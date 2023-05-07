package Polymorphism;

public class MainBank {

	public static void main(String [] args) {
		Bank abc = new Bank_ABC();
		Bank xyz = new Bank_XYZ();
		
		System.out.println("Bank ABC : " +abc.getInterest());
		System.out.println("Bank XYZ : " +xyz.getInterest());
	}
}
