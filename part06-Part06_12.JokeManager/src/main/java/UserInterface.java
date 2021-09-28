import java.util.Scanner;

public class UserInterface {
	private JokeManager manager;
	private Scanner scanner;

	public UserInterface(JokeManager manager, Scanner scanner) {
		this.manager = manager;
		this.scanner = scanner;
	}

	public void start() {
		while (true) {
			System.out.println("Commands:");
			System.out.println(" 1 - add a joke");
			System.out.println(" 2 - draw a joke");
			System.out.println(" 3 - list jokes");
			System.out.println(" X - stop");
			String command = scanner.nextLine();
			switch (command) {
				case "1":
					add();
					break;
				case "2":
					System.out.println(manager.drawJoke());
					break;
				case "3":
					System.out.println("Printing the jokes.");
					manager.printJokes();
					break;
				case "X":
					return;
				default:
					System.out.println("unknown command");
			}
		}
	}

	private void add() {
		System.out.println("Write the joke to be added:");
		manager.addJoke(scanner.nextLine());
	}
}
