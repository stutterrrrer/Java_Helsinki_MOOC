
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        if (Boolean.valueOf(scanner.nextLine())) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
}