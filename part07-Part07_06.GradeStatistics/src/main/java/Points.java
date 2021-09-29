import java.util.ArrayList;
import java.util.Arrays;

public class Points {
	private ArrayList<Integer> points;
	private int[] gradeCount = new int[6];

	public Points() {
		points = new ArrayList<>();
	}

	public ArrayList<Integer> getPoints() {
		return points;
	}

	public String average() {
		if (points.size() == 0) {
			return "-";
		}
		int sum = 0;
		for (int point : points) {
			sum += point;
		}
		return String.valueOf((double) sum / points.size());
	}

	public void convertPointsToGrades() {
		// initialize array; is this necessary?
		Arrays.fill(gradeCount, 0);
		for (int point : points) {
			int grade;
			// convert to grade: within range [0, 5];
			grade = Math.max(0, Math.min(point / 10 - 4, 5));
			gradeCount[grade]++;
		}
	}

	public void printGradeDistribution() {
		System.out.println("Grade distribution: ");
		convertPointsToGrades();
		for (int i = 5; i >= 0; i--) {
			int count = gradeCount[i];
			System.out.print(i + ": ");
			for (int j = 0; j < count; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
