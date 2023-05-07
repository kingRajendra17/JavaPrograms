public class Exception1 {

	public static void main(String[] args) {	
		
		try {
			int a = 100 / 2;
			System.out.print(a); // throws and error
		} catch (Exception e) {
			System.out.print(e); // handled by exception
		}
		
		
	}
}
