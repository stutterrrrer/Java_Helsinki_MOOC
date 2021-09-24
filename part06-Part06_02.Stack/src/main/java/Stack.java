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
		String target = this.list.get(this.list.size() - 1);
		// can't do list.remove(target); because there may be different elements that have the same content as target
		this.list.remove(this.list.size() - 1);
		return target;
	}
}
