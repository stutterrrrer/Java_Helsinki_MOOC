
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Greetings! How are you doing?");
        // this variable is not used; it's just so snL has something to return to.
        String user_input = scanner.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        user_input = scanner.nextLine();
        System.out.println("Thanks for sharing!");
    }
}
