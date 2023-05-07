public class Finally {

	public static int retInt() {
		int a = 100;
		
		try {
			return a;
		} catch (Exception e){
			System.out.println(e);
		} finally {
			// a = 1000;
			System.out.println("Finally Called");
		    return a;
		}
	}
	
	public static void main(String [] args) {
		System.out.println(retInt());
	}
}

