
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
           /*"splits" is an array of Strings,
           effectively declared with curly braces + elements*/
            String[] splits = input.split(" ");
            for (String split : splits) {
                System.out.println(split);
            }
        }
    }
}
