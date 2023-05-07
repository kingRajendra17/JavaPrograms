
public class Recursion {
	
	public static int Factorial(int N) {
		if (N <= 1) {
			return 1;
		}
		else {
			return (N * Factorial(N-1));
		}
	}

	 public static void main(String[] args) {
		 System.out.print(Factorial(5));
	 }
}
