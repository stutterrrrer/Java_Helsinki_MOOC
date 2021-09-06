
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here.
        System.out.println("Enter the first string:");
        String str1 = scan.nextLine();
        System.out.println("Enter the second string");
        if (str1.equals(scan.nextLine())) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
