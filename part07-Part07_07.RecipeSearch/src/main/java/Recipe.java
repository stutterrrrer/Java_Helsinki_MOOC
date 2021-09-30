import java.util.ArrayList;

public class Recipe {
	private String name;
	private int cookingTime;
	private ArrayList<String> ingredients;

	public Recipe(String wholeRecipe) {
		String[] lines = wholeRecipe.split("\n");
		name = lines[0];
		cookingTime = Integer.valueOf(lines[1]);
		ingredients = new ArrayList<>();
		for (int i = 2; i < lines.length; i++) {
			ingredients.add(lines[i]);
		}
	}

	public String getName() {
		return name;
	}

	public int getCookingTime() {
		return cookingTime;
	}

	public ArrayList<String> getIngredients() {
		return ingredients;
	}

	public String toString() {
		return name + ", " + "cooking time: " + cookingTime;
	}
}
