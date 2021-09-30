
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("File to read: ");
		String file = scanner.nextLine();

		ArrayList<Recipe> recipes = new ArrayList<>();

		try {
			// read all file content into a single string:
			String content = new String(Files.readAllBytes(Paths.get(file)));
			// split the string (file content) by empty lines:
			String[] splits = content.split("\n{2,}");
			for (String split : splits) {
				recipes.add(new Recipe(split));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		UserInterface ui = new UserInterface(recipes, scanner);
		ui.start();
	}
}
