
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        Integer nb1 = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        Integer nb2 = Integer.valueOf(scan.nextLine());

        if (nb1 > nb2) {
            System.out.println("Greater number is: " + nb1);
        } else if (nb1 < nb2) {
            System.out.println("Greater number is: " + nb2);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
