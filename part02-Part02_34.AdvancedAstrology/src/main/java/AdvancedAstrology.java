
public class AdvancedAstrology {

    public static void printStars(int number) {
        // first part of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        /* print the tree top first, then the base */
        /*the ith level in the treetop has (2i - 1) stars,
         * surrounded by
         * (height * 2 - 1 - (2i - 1)) / 2 = height - i
         * spaces on either side
         * actually just the left; the printStar method ends with a new line character anyway*/
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1);
        }
        /* for the base to be at the middle, below the last level of treetop:
        * say the number of spaces is x on each line;
        * 2x + 3 = 2 * height - 1; x = height - 2. */
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
