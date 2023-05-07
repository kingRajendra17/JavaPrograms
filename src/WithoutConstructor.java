public class WithoutConstructor {
	
	String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
 
	public static void main(String []args)  {
		WithoutConstructor car = new WithoutConstructor();
		car.setName("Ferrai");
        car.getName();
		System.out.print("The Car name is "+car.getName());
	}
	}
