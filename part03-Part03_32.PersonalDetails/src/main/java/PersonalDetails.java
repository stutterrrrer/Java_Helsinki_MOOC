
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0, sum = 0, highestCharCount = 0;
        String longest = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            count++;
            String[] splits = input.split(",");
            sum += Integer.valueOf(splits[1]);
            int charCount = splits[0].length();
            if (charCount > highestCharCount) {
                highestCharCount = charCount;
                longest = splits[0];
            }
        }

        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + (double)sum / count);
    }
}
