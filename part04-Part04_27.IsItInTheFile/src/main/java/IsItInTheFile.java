
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Name of the file:");
		String file = scanner.nextLine();

		System.out.println("Search for:");
		String searchedFor = scanner.nextLine();

		ArrayList<String> fileContent = new ArrayList<>();
		try (Scanner fileReader = new Scanner(Paths.get(file))) {
			while (fileReader.hasNextLine()) {
				fileContent.add(fileReader.nextLine());
			}
		} catch (Exception e) {
			System.out.println("Reading the file " + file + " failed.");
		}

		// check for the existence of the search target in the loaded arraylist
		for (String line : fileContent) {
			if (line.equals(searchedFor)) {
				System.out.println("Found!");
				// stop the loop AND THE PROGRAM if the target is found.
				return;
			}
		}
		System.out.println("Not found.");
	}
}
