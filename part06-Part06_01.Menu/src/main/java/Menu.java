
import java.util.ArrayList;

public class Menu {

	private ArrayList<String> meals;

	public Menu() {
		this.meals = new ArrayList<>();
	}

	// implement the required methods here
	public void addMeal(String meal) {
		if (!this.meals.contains(meal)) {
			this.meals.add(meal);
		}
	}

	public void printMeals() {
		for (String meal : this.meals) {
			System.out.println(meal);
		}
	}

	public void clearMenu() {
		// you could use the ArrayList class's built-in clear() method like so:
//		 this.meals.clear();
		// or use a DECREMENTAL for-loop:
		for (int i = this.meals.size() - 1; i >= 0; i--) {
			this.meals.remove(i);
		}
	}
}
