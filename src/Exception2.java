import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter Number : ");
			int num = sc.nextInt(); // Only Number , Error for String Value
			System.out.println(num);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
