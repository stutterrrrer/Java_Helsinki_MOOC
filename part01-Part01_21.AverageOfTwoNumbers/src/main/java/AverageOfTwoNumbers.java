
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        Integer nb1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        Integer nb2 = Integer.valueOf(scanner.nextLine());
        System.out.println("The average is " + ((double) nb1 + nb2) / 2);
    }
}
