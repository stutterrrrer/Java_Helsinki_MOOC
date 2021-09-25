import java.util.ArrayList;

public class Suitcase {
	private ArrayList<Item> items;
	private final int maxWeight;

	public Suitcase(int maxWeight) {
		this.items = new ArrayList<>();
		this.maxWeight = maxWeight;
	}

	public void addItem(Item item) {
		items.add(item);
		if (totalWeight() > maxWeight) {
			items.remove(item);
		}
	}

	public String toString() {
		String count = items.size() == 0 ? "no" : String.valueOf(items.size());
		String plural = items.size() == 1 ? "" : "s";
		return count + " item" + plural + " (" + totalWeight() + " kg)";
	}

	public void printItems() {
		for (Item item : items) {
			System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
		}
	}

	public int totalWeight() {
		int sum = 0;
		for (Item item : items) {
			sum += item.getWeight();
		}
		return sum;
	}

	public Item heaviestItem() {
		if (items.size() == 0) {
			return null;
		}
		Item heaviest = items.get(0);
		for (Item item : items) {
			heaviest = item.getWeight() > heaviest.getWeight() ? item : heaviest;
		}
		return heaviest;
	}
}









