
public class NullException {

	public static void main(String[] args) {

		try {
			Object obj = new Object();
			String con = obj.toString();
			System.out.println(con);

		} catch (Exception e) {
			System.out.println("Caught : " + e.getMessage());
		}
	}

}
