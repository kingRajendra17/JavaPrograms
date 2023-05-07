
public class SystemProperties {

	public static void main(String[] args) {

		// Current Time
		long currentTime = System.currentTimeMillis();
		System.out.println("Current Time : " + currentTime);

		System.out.println(" ");

		// System Properties
		System.out.println("System Properties : ");
		System.getProperties().list(System.out);

		System.out.println(" ");

		// JRE Version
		String jre = System.getProperty("java.version");
		System.out.println("JRE Version : " + jre);

		System.out.println(" ");

		// To get the path of Java File
		String java = System.getenv("JAVA");
		System.out.println("Java Home : " + java);

		System.out.println(" ");
		// Exit the program with an error code
		System.exit(1);
	}

}
