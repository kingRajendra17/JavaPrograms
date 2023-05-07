import java.util.Scanner;

public class NegativeException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter Number : ");
			int num = sc.nextInt();
			if (num > 0  && num % 2 == 0) {
				System.out.println("Even Number");
			} else if (num > 0 && num % 2 == 1) {
				System.out.println("Odd Number");
			} else {
				throw new InvalidException("Negative Number");
			}
			System.out.println(num);
		} catch (Exception e) {
			System.out.println("Caught by Exception : " + e);
		}

	}
}

class InvalidException extends Exception {
	public InvalidException(String message) {
			super(message);
		}
}
