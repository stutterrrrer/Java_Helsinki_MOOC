
import java.util.ArrayList;

public class SimpleCollection {

	private String name;
	private ArrayList<String> elements;

	public SimpleCollection(String name) {
		this.name = name;
		this.elements = new ArrayList<>();
	}

	public void add(String element) {
		this.elements.add(element);
	}

	public ArrayList<String> getElements() {
		return this.elements;
	}

	@Override
	public String toString() {
		String out = "The collection " + this.name + " ";
		if (elements.isEmpty()) {
			return out + "is empty.";
		} else {
			String plural = elements.size() == 1 ? ":\n" : "s:\n";
			out += "has " + elements.size() + " element" + plural;
		}

		// apparently... the test doen't want a trailing new line if there's only one element.
		// now that's just straight up pedantic right?
		if (elements.size() == 1) {
			return out += elements.get(0);
		}
		for (String element : elements) {
			out += element + "\n";
		}
		return out;
		}

	}
