
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // requirements: create 3 statistics objects
        Statistics all = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();

        System.out.println("Enter numbers:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            all.addNumber(input);
            if (input % 2 == 0) {
                even.addNumber(input);
            } else {
                odd.addNumber(input);
            }
        }
        System.out.println("Sum: " + all.sum());
        System.out.println("Sum of even numbers:" + even.sum());
        System.out.println("Sum of odd numbers:" + odd.sum());
    }
}
