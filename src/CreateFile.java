
import java.io.*; // IOException, File, PrintWriter

public class CreateFile {

	public static void main(String[] args) {

		try {
			File file = new File("filename.txt");

			if (!file.exists()) {
				file.createNewFile();
			}
				PrintWriter pw = new PrintWriter(file);
				pw.println("Hello");
				pw.println("Rajendra");
				pw.close();
				System.out.println("File Created");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
