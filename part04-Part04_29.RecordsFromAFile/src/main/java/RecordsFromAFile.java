
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Name of the file:");
		try (Scanner fileReader = new Scanner(Paths.get(scanner.nextLine()))) {
			while (fileReader.hasNextLine()) {
				String[] splits = fileReader.nextLine().split(",");
				System.out.println(splits[0] + ", age: " + splits[1] + " years");
			}
		} catch (Exception e) {
			System.out.println("Error accessing file.");
		}
	}
}
