import java.util.ArrayList;

public class Statistics {
	private int count;
	private ArrayList<Integer> numbers = new ArrayList<>();

	// a constructor that simply initializes count to 0; can be left empty to use the default constructor
	public Statistics() {
		this.count = 0;
	}

	public void addNumber(int input) {
		this.numbers.add(input);
	}

	public int getCount() {
		return this.count = numbers.size();
	}

	public int sum() {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}

	public double average() {
		// check for dividing by 0 error.
		return this.getCount() == 0 ? 0 : (double)this.sum()/this.getCount();
	}
}
