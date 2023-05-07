public class Enum {
	enum Level {
		LOW, MEDIUM, HIGH
	}

	public static void main(String[] args) {
		Level var = Level.MEDIUM;
		System.out.println(var);

		switch (var) {
		   case LOW:
			   System.out.print("Low Level");
			   break;
		   case MEDIUM:
			   System.out.print("Medium Level");
			   break;
		   case HIGH:
			   System.out.print("High Level");
			   break;
		}
	}

}
