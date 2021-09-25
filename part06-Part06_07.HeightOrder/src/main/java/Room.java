import java.util.ArrayList;

public class Room {
	private ArrayList<Person> persons;

	public Room() {
		this.persons = new ArrayList<>();
	}

	public void add(Person person) {
		this.persons.add(person);
	}

	public boolean isEmpty() {
		return this.persons.isEmpty();
	}

	public ArrayList<Person> getPersons() {
		return persons;
	}

	public Person shortest() {
		if (this.isEmpty()) {
			return null;
		}
		Person shortest = this.persons.get(0);
		for (Person person : persons) {
			shortest = person.getHeight() < shortest.getHeight() ? person : shortest;
		}
		return shortest;
	}

	public Person take() {
		if (this.isEmpty()) {
			return null;
		}
		Person shortest = this.shortest();
		this.persons.remove(shortest);
		return shortest;
	}
}
