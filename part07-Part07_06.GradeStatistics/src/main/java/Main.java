
import java.util.Scanner;

public class Main {

	public static final int PASSING_GRADE = 50;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Write your program here -- consider breaking the program into
		// multiple classes.
		Points all = new Points();
		Points passed = new Points();
		System.out.println("Enter point totals, -1 stops:");
		while (true) {
			int point = Integer.valueOf(scanner.nextLine());
			if (point == -1) {
				break;
			} else if (point >= 0 && point <= 100) {
				if (point >= PASSING_GRADE) {
					passed.getPoints().add(point);
				}
				all.getPoints().add(point);
			}
		}
		System.out.println("Point average (all): " + all.average());
		System.out.println("Point average (passing): " + passed.average());

		System.out.println("Pass percentage: " + (double)passed.getPoints().size() / all.getPoints().size() * 100);
		all.printGradeDistribution();
	}
}
