import java.util.*;

public class Find {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a Number : ");

		int num = scan.nextInt();

		ArrayList<Integer> numlist = new ArrayList<Integer>();

		numlist.add(num + 2);
		numlist.add(num + 4);
		numlist.add(num + 5);
		
		System.out.println("Elements in Array: ");		
		for (int n : numlist) {			
			System.out.println(n);
		}

		for (int n : numlist) {
			if (String.valueOf(n).contains("6")) {
				System.out.print("True");
				break;
			} else {
				System.out.print("False");
				break;
			} 
		}
	}
}
