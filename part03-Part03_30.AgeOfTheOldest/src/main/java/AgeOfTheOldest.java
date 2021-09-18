
import java.util.Scanner;

public class AgeOfTheOldest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int greatest = 0;
		while (true) {
			String input = scanner.nextLine();
			if (input.equals("")) {
				break;
			}
			String[] splits = input.split(",");
			int age = Integer.valueOf(splits[1]);
			greatest = age > greatest ? age : greatest;
		}
		System.out.println("Age of the oldest: " + greatest);
	}
}
