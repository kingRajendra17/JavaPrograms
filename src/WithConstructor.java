public class WithConstructor {

	String name;


public WithConstructor(String name) {
	this.name = name;
	
}

public String getName() {
	return name;
}

public static void main(String []args)  {
	WithConstructor car = new WithConstructor("Bucati");

	System.out.print("The Car name is "+car.getName());
}
}

