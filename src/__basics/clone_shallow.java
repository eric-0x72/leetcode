package __basics;

import java.util.Arrays;

public class clone_shallow {

	public static void main(String[] args) {

		int[][] input = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		int[][] copy = input.clone();

		input[0][0] = 999;

		for (int i = 0; i < 4; i++)
			System.out.println(Arrays.toString(copy[i]));

	}
}