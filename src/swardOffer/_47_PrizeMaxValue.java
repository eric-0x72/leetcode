package swardOffer;

import java.util.Arrays;

public class _47_PrizeMaxValue {

	public static int maxValue(int[][] grid) {
		if (grid.length == 0)
			return 0;

		int row = grid.length;
		int col = grid[0].length;

		int[][] res = new int[row][col];

		// first row, retains
		for (int i = 0; i < col; i++) {
			res[0][i] = (i == 0 ? 0 : res[0][i - 1]) + grid[0][i]; // left accumulation + self
			System.out.println(res[0][i]);
		}

		// first col, retains
		for (int i = 0; i < row; i++)
			res[i][0] = (i == 0 ? 0 : res[i - 1][0]) + grid[i][0]; // up accumulation + self

		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				res[i][j] = Math.max(res[i][j - 1], res[i - 1][j]) + grid[i][j]; // left, up
			}
		}
		// System.out.println(Arrays.deepToString(res));
		return res[row - 1][col - 1];
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 5 }, { 3, 2, 1 } };

		int res = maxValue(arr);
		System.out.println(res);
	}

}
