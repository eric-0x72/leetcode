package contest;

import java.util.ArrayList;
import java.util.List;

/**
 * Lucky number is min in a row and max in column
 *
 */
public class _5356_LuckyNumbersInMatrix {

	public List<Integer> luckyNumbers(int[][] matrix) {

		int rows = matrix.length;
		int cols = matrix[0].length;

		int minrow = Integer.MAX_VALUE;
		int minrowcol = 0;

		List<Integer> res = new ArrayList<>();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				int cur = matrix[i][j];

				// find min in row i
				if (cur < minrow) {
					minrow = cur;
					minrowcol = j; // gives the col of min element in row i
				}
			}

			// check minrowcol, see if i is the max in col
			int maxcol = 0;
			int maxcolrow = 0;
			for (int k = 0; k < rows; k++) {
				int cur = matrix[k][minrowcol];
				if (cur > maxcol) {
					maxcol = cur;
					maxcolrow = k; // gives the row of max element in row minrowcol
				}
			}

			if (maxcolrow == i) {
				res.add(matrix[maxcolrow][minrowcol]);
			}

		}
		return res;
	}

}
