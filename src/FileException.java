// import java.io.*;

import java.io.File;
import java.io.PrintWriter; // IO Classes
import java.io.IOException;

public class FileException {

	public static void main(String[] args) {

		try {
			File file = new File("FileName.txt"); // File Object

			if (!file.exists()) { // Checks if file exists
				file.createNewFile();
			}

			PrintWriter pw = new PrintWriter(file); // To Insert Data in New File
			pw.println("Hello Java");
			pw.println("Programmer");
			pw.println(117);
			pw.close(); // End of Inserting Data and Close file
			System.out.println("File Created and Data Inserted");

		} catch (IOException e) {
			e.printStackTrace(); // Error Exception
		}
	}
}
              