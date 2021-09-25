import java.util.Scanner;

public class TextUI {
	private Scanner scanner;
	private SimpleDictionary dictionary;

	public TextUI(Scanner scanner, SimpleDictionary dictionary) {
		this.scanner = scanner;
		this.dictionary = dictionary;
	}

	public void start() {
		while (true) {
			System.out.print("Command: ");
			String command = scanner.nextLine();
			switch (command) {
				case "end":
					System.out.println("Bye bye!");
					return;
				case "add": {
					add();
					break;
				}
				case "search": {
					search();
					break;
				}
				default:
					System.out.println("Unknown command");
					break;
			}
		}
	}

	private void search() {
		System.out.print("To be translated: ");
		String word = scanner.nextLine();
		String translation = dictionary.translate(word);
		// use `==` because dictionary.translate() returns String too
		// and String is a reference type - so null is just a value of a reference variable.
		if (translation == null) {
			System.out.println("Word " + word + " was not found");
		} else {
			System.out.println("Translation: " + translation);
		}
	}

	private void add() {
		System.out.print("Word: ");
		String word = scanner.nextLine();
		System.out.print("Translation: ");
		String translation = scanner.nextLine();
		dictionary.add(word, translation);
	}
}
