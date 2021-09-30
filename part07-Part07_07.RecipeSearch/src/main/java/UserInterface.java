import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	private final ArrayList<Recipe> recipes;
	private final Scanner scanner;

	public UserInterface(ArrayList<Recipe> recipes, Scanner scanner) {
		this.recipes = recipes;
		this.scanner = scanner;
	}

	public void start() {
		System.out.println("Commands:");
		System.out.println("list - lists the recipes");
		System.out.println("stop - stops the program");
		System.out.println("find name - searches recipes by name");
		System.out.println("find cooking time - searches recipes by cooking time");
		System.out.println("find ingredient - searches recipes by ingredient");

		while (true) {
			System.out.print("Enter command: ");
			String command = scanner.nextLine();
			if (command.equals("stop")) {
				break;
			}
			switch (command) {
				case "list":
					list();
					break;
				case "find name":
					findByName();
					break;
				case "find cooking time":
					findByCookingTime();
					break;
				case "find ingredient":
					findByIngredient();
					break;
				default:
					System.out.println("unknown command");
			}
		}
	}

	private void findByIngredient() {
		System.out.print("Ingredient: ");
		String ingredient = scanner.nextLine();
		System.out.println("Recipes: ");
		for (Recipe recipe : recipes) {
			if (recipe.getIngredients().contains(ingredient)) {
				System.out.println(recipe);
			}
		}
	}

	private void findByCookingTime() {
		System.out.print("Max cooking time: ");
		int max = Integer.parseInt(scanner.nextLine());
		System.out.println("Recipes:");
		for (Recipe recipe : recipes) {
			if (recipe.getCookingTime() <= max) {
				System.out.println(recipe);
			}
		}
	}

	private void findByName() {
		System.out.print("Searched word: ");
		String searched = scanner.nextLine();
		System.out.println("Recipes:");
		for (Recipe recipe : recipes) {
			if (recipe.getName().contains(searched)) {
				System.out.println(recipe);
			}
		}
	}

	private void list() {
		for (Recipe recipe : recipes) {
			System.out.println(recipe);
		}
	}
}