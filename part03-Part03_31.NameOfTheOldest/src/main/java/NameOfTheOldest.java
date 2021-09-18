
import java.util.Scanner;

public class NameOfTheOldest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int greatest = 0;
        String oldest = "placeHolder";
        while (true) {
			String input = scanner.nextLine();
			if (input.equals("")) {
				break;
			}
			String[] splits = input.split(",");
			int age = Integer.valueOf(splits[1]);
            if (age > greatest) {
                greatest = age;
                oldest = splits[0];
            }
		}
		System.out.println("Name of the oldest: " + oldest);
	}
}
