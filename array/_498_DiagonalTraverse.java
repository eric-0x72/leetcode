package array;

import java.util.ArrayList;
import java.util.Collections;

public class _498_DiagonalTraverse {

	public static int[] findDiagonalOrder(int[][] matrix) {
		if (matrix == null || matrix.length == 0)
			return new int[0];

		int row = matrix.length, col = matrix[0].length;
		int k = 0;
		int[] res = new int[row * col];
		ArrayList<Integer> diag = new ArrayList<>();

		// visit first row and last column, get head of diagonal line
		for (int i = 0; i < row + col - 1; i++) { // n+m-1 head of diagonal
			diag.clear();

			// first row, or i-col+1 row which is last column
			int r = i < col ? 0 : i - col + 1;
			int c = i < col ? i : col - 1;

			// while row reach bottom and column reach left most
			while (r < row && c > -1) {
				diag.add(matrix[r][c]);
				r++;
				c--;
			}

			if (i % 2 == 0)
				Collections.reverse(diag);

			for (int j = 0; j < diag.size(); j++)
				res[k++] = diag.get(j);
		}

		return res;
	}

}
