
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int posCount = 0, posSum = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            } else if (input < 0) {
                continue;
            }
            posCount++;
            posSum += input;
        }
        if (posCount == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) posSum / posCount);
        }
    }
}
