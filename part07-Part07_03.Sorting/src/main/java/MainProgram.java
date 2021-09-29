import java.util.Arrays;

public class MainProgram {

	public static void main(String[] args) {
		// write your test code here
		int[] array = {3, 1, 5, 99, 3, 12};
		System.out.println(Arrays.toString(array));
		sort(array);
	}

	public static int indexOfSmallestFrom(int[] array, int startIndex) {
		int indexOfSmallestFrom = startIndex;
		for (int i = startIndex + 1; i < array.length; i++) {
			indexOfSmallestFrom = array[indexOfSmallestFrom] < array[i] ? indexOfSmallestFrom : i;
		}
		return indexOfSmallestFrom;
	}

	public static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	public static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			swap(array, i, indexOfSmallestFrom(array, i));
			// print out the whole array after every swap
			System.out.println(Arrays.toString(array));
		}
	}
}
