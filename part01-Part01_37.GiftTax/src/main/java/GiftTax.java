
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        Integer value = Integer.valueOf(scan.nextLine());
        Double tax;
        if (value >= 5000) {
            if (value < 25000) {
                tax = 100 + .08 * (value - 5000);
            } else if (value < 55000) {
                tax = 1700 + .1 * (value - 25000);
            } else if (value < 200000) {
                tax = 4700 + .12 * (value - 55000);
            } else if ( value < 1000000) {
                tax = 22100 + .15 * (value - 200000);
            } else {
                tax = 142100 + .17 * (value - 1000000);
            }
            System.out.println("Tax: " + tax);
        } else {
            System.out.println("No tax!");
        }
    }
}
