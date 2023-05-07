import java.util.Date;
import java.text.*;

public class SimpleDateTime {

	public static void main(String [] args) {
		
		Date date = new Date();
		
		System.out.println(date.getDate());  // Current Date
		System.out.println(1+date.getMonth());  // Current Month
		System.out.println(1900+date.getYear());  // Current Year
		
		SimpleDateFormat simple = new SimpleDateFormat("d-M-yyyy H:m:s S a");
		System.out.println(simple.format(date));	
	}
}