package __basics;

import java.util.Arrays;

public class Clone_shallow_deep {

	public static void shallow() {
		int[][] original = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		int[][] copy = original.clone(); // clone gives a shallow copy of arr

		original[0][0] = 999; // if we change original array's element

		for (int i = 0; i < 4; i++)
			System.out.println(Arrays.toString(copy[i])); // then copy's element changes too
	}

	private static void deep() {
		int[][] original = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		int[][] copy = new int[original.length][];

		for (int i = 0; i < copy.length; i++) {
			copy[i] = Arrays.copyOf(original[i], original[i].length);
		}
		for (int i = 0; i < 4; i++)
			System.out.println(Arrays.toString(copy[i]));
	}

	public static void main(String[] args) {
		// shallow();
		deep();
	}

}