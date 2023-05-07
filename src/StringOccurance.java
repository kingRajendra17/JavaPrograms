
public class StringOccurance {

	public static void main(String[] args) {

		String strin = "Elephant";
		
		String str = strin.toLowerCase();
		
		char ch1 = 'e';

		int count = 0;
		
		for (int i = 0; i <str.length(); i++) {       
			if (str.charAt(i)== ch1) {
				count++;
			}
		}
		
		System.out.println("Count : " +count);
		
		// Reversed
		
		String rev = "";
		char ch2;
		
		for (int j = 0; j <str.length(); j++) {
			ch2 = str.charAt(j);
			rev = ch2 + rev;
		}
		System.out.println("Reversed : " +rev);
		
	}
}
