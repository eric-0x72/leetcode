package array;

import java.util.Arrays;

/**
 * method learned from post
 * 
 * for a clockwise turn, reflect horizontally and then diagonally,
 * 
 * or reflect diagonally and then vertically, like the solution below
 */
public class _48_RotateImage {

	public void rotate(int[][] matrix) {

		int n = matrix.length;

		// reflect diagonally
		// transpose matrix
		for (int i = 0; i < n; i++) {
			// not j = 0 !!! otherwise go back to original
			// because changing the upper triangle flip lower as well
			for (int j = i; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		// reflect vertically
		// reverse each row i
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {

				int other = (n - 1) - j; // to be swap with j

				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][other];
				matrix[i][other] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < 2; i++) {
			int temp = a[i];
			int other = 5 - i - 1; // the position to be swapped
			a[i] = a[other];
			a[other] = temp;
		}
		System.out.println(Arrays.toString(a));

	}
}
