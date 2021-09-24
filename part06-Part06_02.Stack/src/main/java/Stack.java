import java.util.ArrayList;

public class Stack {
	private ArrayList<String> list;

	public Stack() {
		this.list = new ArrayList<>();
	}

	public boolean isEmpty() {
		return this.list.size() == 0;
	}

	public void add(String value) {
		this.list.add(value);
	}

	public ArrayList<String> values() {
		return this.list;
	}

	public String take() {
		// from mooc fi's suggested solution: remove() returns the removed element. (see remove() declaration)
		return this.list.remove(this.list.size() - 1);
	}
}
