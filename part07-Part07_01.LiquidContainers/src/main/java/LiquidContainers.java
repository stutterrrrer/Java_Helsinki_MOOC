
import java.util.Scanner;

public class LiquidContainers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int max = 100;

		int firstContainer = 0, secondContainer = 0;
		System.out.println("First: " + firstContainer + "/" + max + "\n"
				+ "Second: " + secondContainer + "/" + max);

		while (true) {

			String input = scan.nextLine();
			if (input.equals("quit")) {
				break;
			}
			String[] splits = input.split(" ");
			String command = splits[0];
			int amount = Integer.valueOf(splits[1]);
			switch (command) {
				case "add":
					if (amount >= 0) {
						firstContainer += amount;
						firstContainer = Math.min(firstContainer, max);
					}
					break;
				case "move":
					if (amount >= 0) {
						int moved = Math.min(amount, firstContainer);
						firstContainer -= moved;
						secondContainer += moved;
						secondContainer = Math.min(secondContainer, max);
					}
					break;
				case "remove":
					if (amount >= 0) {
						secondContainer = Math.max(0, secondContainer - amount);
					}
					break;
				default:
					System.out.println("unknown command");
			}
			System.out.println("First: " + firstContainer + "/" + max + "\n"
					+ "Second: " + secondContainer + "/" + max);
		}
	}
}
