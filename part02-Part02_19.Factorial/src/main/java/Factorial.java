
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // deals with the edge case of 0 input.
        int fact = 1;
        System.out.println("Give a number:");
        int input = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i <= input; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }
}
