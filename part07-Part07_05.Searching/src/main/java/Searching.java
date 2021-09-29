
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		// The program below is meant for testing the search algorithms you'll write
		Scanner scanner = new Scanner(System.in);
		ArrayList<Book> books = new ArrayList<>();
		System.out.println("How many books to create?");
		int numberOfBooks = Integer.valueOf(scanner.nextLine());
		for (int i = 0; i < numberOfBooks; i++) {
			books.add(new Book(i, "name for the book " + i));
		}

		System.out.println("Id of the book to search for?");
		int idToSearchFor = Integer.valueOf(scanner.nextLine());

		System.out.println("");
		System.out.println("Searching with linear search:");
		long start = System.currentTimeMillis();
		int linearSearchId = linearSearch(books, idToSearchFor);
		System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
		if (linearSearchId < 0) {
			System.out.println("Book not found");
		} else {
			System.out.println("Found it! " + books.get(linearSearchId));
		}

		System.out.println("");

        System.out.println("");
        System.out.println("Searching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

		System.out.println("");
		System.out.println("Searching with recursive binary search:");
		start = System.currentTimeMillis();
		int recursiveBinarySearchID = binarySearchRecursive(books, idToSearchFor);
		System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
		if (recursiveBinarySearchID < 0) {
			System.out.println("Book not found");
		} else {
			System.out.println("Found it! " + books.get(recursiveBinarySearchID));
		}
	}

	public static int linearSearch(ArrayList<Book> books, int searchedId) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getId() == searchedId) {
				return i;
			}
		}
		return -1;
	}

	public static int binarySearch(ArrayList<Book> books, long searchedId) {
		// implemented with loops, instead of recursion.
		for (int start = 0, end = books.size() - 1; end >= start; ) {
			int middle = (start + end) / 2;
			if (books.get(middle).getId() == searchedId) {
				return middle;
			} else if (searchedId < books.get(middle).getId()) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
		}
		return -1;
	}

	public static int binarySearchRecursive(ArrayList<Book> books, long searchedId) {
		int n = books.size();
		if (n == 1) {
			return books.get(0).getId() == searchedId ? 0 : -9999999;
		} else {
			int mid = n / 2;
			int midId = books.get(n / 2).getId();
			if (midId == searchedId) {
				return mid;
			} else if (searchedId < midId) {
				ArrayList<Book> leftHalf = new ArrayList<>();
				for (int i = 0; i < mid; i++) {
					leftHalf.add(books.get(i));
				}
				return binarySearchRecursive(leftHalf, searchedId);
			} else {
				ArrayList<Book> rightHalf = new ArrayList<>();
				for (int i = mid + 1; i < n; i++) {
					rightHalf.add(books.get(i));
				}
				return mid + 1 + binarySearchRecursive(rightHalf, searchedId);
			}
		}
	}
}











