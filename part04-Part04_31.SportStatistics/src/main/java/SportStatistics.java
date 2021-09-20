
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("File:");
		String file = scan.nextLine();
		System.out.println("Team:");
		String team = scan.nextLine();
		int wins = 0, losses = 0;
		try (Scanner fileReader = new Scanner(Paths.get(file))) {
			while (fileReader.hasNextLine()) {
				String line = fileReader.nextLine();
				// continue to next iteration if the line(game) doesn't have team.
				if (!line.contains(team)) {
					continue;
				}
				String splits[] = line.split(",");
				// find the index of the team in the split line.
				int i = splits[0].equals(team) ? 0 : 1;
				if (Integer.valueOf(splits[i + 2]) > Integer.valueOf(splits[3 - i])) {
					wins++;
				} else losses++;
			}
		} catch (Exception e) {
			System.out.println("Accessing file" + file + " failed");
		}

		System.out.println("Games: " + (wins + losses));
		System.out.println("Wins: " + wins);
		System.out.println("Losses: " + losses);
	}

}
