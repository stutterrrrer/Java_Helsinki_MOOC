import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	private ArrayList<Bird> birds;
	private Scanner scanner;

	public UserInterface(Scanner scanner) {
		this.scanner = scanner;
		this.birds = new ArrayList<>();
	}

	public void start() {
		while (true) {
			System.out.print("? ");
			String command = scanner.nextLine();
			switch (command) {
				case "Quit":
					return;
				case "Add":
					add();
					break;
				case "Observation":
					addObservation();
					break;
				case "All":
					printAll();
					break;
				case "One":
					printOne();
					break;
				default:
					System.out.println("Unknown command");
			}
		}
	}

	private void printOne() {
		System.out.print("Bird? ");
		String name = scanner.nextLine();
		for (Bird bird : birds) {
			if (bird.getName().equals(name)) {
				System.out.println(bird);
				return;
			}
		}
	}

	private void printAll() {
		for (Bird bird : birds) {
			System.out.println(bird);
		}
	}

	private void addObservation() {
		System.out.print("Bird? ");
		String name = scanner.nextLine();
		for (Bird bird : birds) {
			if (bird.getName().equals(name)) {
				bird.addObservation();
				return;
			}
		}
		System.out.println("Not a bird!");
	}

	private void add() {
		System.out.print("Name: ");
		String name = scanner.nextLine();
		System.out.print("Name in Latin: ");
		String latinName = scanner.nextLine();
		birds.add(new Bird(name, latinName));
	}
}
