
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int count = 0, sum = 0, even = 0;
        while (true) {
            System.out.println("Give numbers:");
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                System.out.println("Thx! Bye!");
                break;
            } else if (input % 2 == 0) {
                even++;
            }
            count++;
            sum += input;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + (double) sum / count);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + (count - even));
    }
}
