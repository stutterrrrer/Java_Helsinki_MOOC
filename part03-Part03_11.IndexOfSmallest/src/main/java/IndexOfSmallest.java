
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            numbers.add(input);
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallest = numbers.get(0);
        // start with 2nd number since "smallest" is initiated to equal the 1st.
        for (int i = 1; i < numbers.size(); i++) {
            smallest = numbers.get(i) < smallest ? numbers.get(i) : smallest;
        }
        System.out.println("Smallest number: " + smallest);

        // after finding the smallest number in the list, go back in the list to find their index(indices)
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}

