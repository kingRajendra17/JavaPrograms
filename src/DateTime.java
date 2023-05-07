import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateTime {
	
	public static void main(String [] args) {
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Before : " + now);
		
		DateTimeFormatter format_now = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
		
		String now_formatted = now.format(format_now);
		
		System.out.println("After : " + now_formatted);
	}

}
