public class Container {

	private static final int MAX = 100;
	private int liquid;

	public Container() {
		liquid = 0;
	}

	public void add(int amount) {
		if (amount >= 0) {
			liquid += amount;
			liquid = Math.min(liquid, MAX);
		}
	}

	public int remove(int amount) {
		int removed = 0;
		if (amount >= 0) {
			removed = Math.min(amount, liquid);
			liquid -= removed;
		}
		return removed;
	}

	public String toString() {
		return liquid + "/" + MAX;
	}
}
