import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferFile {

	public static void main(String[] args) {

		BufferedReader br = null;            // BufferedReader (Reads the Data in file)

		try {
			br = new BufferedReader(new FileReader("filename.txt"));       // Reads the data inside the file // Define path of file
			String line;                                                  // Stores value line by lines

			while ((line = br.readLine()) != null) {     //while (if file has Data)
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
