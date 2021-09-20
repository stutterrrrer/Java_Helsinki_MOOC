
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

	public static void main(String[] args) {
		// create a scanner object that reads from files
		try (Scanner fileReader = new Scanner(Paths.get("data.txt"))) {
			// read line by line till file end
			while (fileReader.hasNextLine()) {
				System.out.println(fileReader.nextLine());
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
