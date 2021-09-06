
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]");
        Integer score = Integer.valueOf(scan.nextLine());

        Integer level = score / 10;
        if (score < 0) {
            System.out.println("Grade: impossible!");
        } else if (level < 5) {
            System.out.println("Grade: failed");
        } else if (level > 10) {
            System.out.println("Grade: incredible!");
        } else if (level == 10) {
            if (score == 100) {
                System.out.println("Grade: 5");
            } else {
                System.out.println("Grade: Incredible!");
            }
        } else {
            System.out.println("Grade: " + (level - 4));
        }
    }
}
