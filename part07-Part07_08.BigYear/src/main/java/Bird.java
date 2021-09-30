public class Bird {
	private final String name;
	private final String latinName;
	private int observations;

	public Bird(String name, String latinName) {
		this.name = name;
		this.latinName = latinName;
		this.observations = 0;
	}

	public String getName() {
		return name;
	}

	public void addObservation() {
		observations++;
	}
	public String toString() {
		return name + " (" + latinName + "): " + observations + " observations";
	}
}
