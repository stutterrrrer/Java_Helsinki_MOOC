import java.util.ArrayList;

public class Package {
	private ArrayList<Gift> wrappedGifts;

	public Package() {
		this.wrappedGifts = new ArrayList<>();
	}

	public void addGift(Gift gift) {
		wrappedGifts.add(gift);
	}

	public int totalWeight() {
		int sum = 0;
		for (Gift gift : wrappedGifts) {
			sum += gift.getWeight();
		}
		return sum;
	}
}
