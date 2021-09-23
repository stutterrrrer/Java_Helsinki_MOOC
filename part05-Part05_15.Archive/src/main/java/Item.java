public class Item {
	private String identifier;
	private String name;

	public Item(String identifier, String name) {
		this.identifier = identifier;
		this.name = name;
	}

	public boolean equals(Object compared) {
		if (!(compared instanceof Item)) {
			return false;
		} else {
			Item comparedItem = (Item) compared;
			return this.identifier.equals(comparedItem.identifier);
		}
	}

	public String getIdentifier() {
		return identifier;
	}

	public String getName() {
		return name;
	}
}
