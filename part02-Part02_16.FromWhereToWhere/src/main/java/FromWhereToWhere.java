
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int to = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        for (int i = Integer.valueOf(scanner.nextLine()); i <= to; i++) {
            System.out.println(i);
        }
    }
}
