
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb1 = Integer.valueOf(scanner.nextLine());
        int nb2 = Integer.valueOf(scanner.nextLine());
        if (nb1 < nb2) {
            System.out.println(nb1 + " is smaller than " + nb2 + ".");
        } else if (nb1 > nb2) {
            System.out.println(nb1 + " is greater than " + nb2 + ".");
        } else {
            System.out.println(nb1 + " is equal to " + nb2 + ".");
        }
    }
}
