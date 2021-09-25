import java.util.ArrayList;

public class Hold {
	private ArrayList<Suitcase> suitcases;
	private int maxWeight;

	public Hold(int maxWeight) {
		suitcases = new ArrayList<>();
		this.maxWeight = maxWeight;
	}

	public void addSuitcase(Suitcase suitcase) {
		suitcases.add(suitcase);
		if (currentWeight() > maxWeight) {
			suitcases.remove(suitcase);
		}
	}

	public int currentWeight() {
		int weight = 0;
		for (Suitcase suitcase : suitcases) {
			weight += suitcase.totalWeight();
		}
		return weight;
	}

	public void printItems() {
		for (Suitcase suitcase : suitcases) {
			suitcase.printItems();
		}
	}

	public String toString() {
		return suitcases.size() + " suitcases (" + currentWeight() + " kg)";
	}
}
