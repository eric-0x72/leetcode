package DP;

import java.util.Arrays;

public class _64_MinimumPathSum {

	public static int minPathSum(int[][] grid) {

		int rows = grid.length;
		int cols = grid[0].length;
		int[][] dp = new int[rows][cols];

		dp[0][0] = grid[0][0];

		for (int i = 1; i < rows; i++)
			dp[i][0] = dp[i - 1][0] + grid[i][0];

		for (int j = 1; j < cols; j++)
			dp[0][j] = dp[0][j - 1] + grid[0][j];

		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < cols; j++) {

				int left = dp[i][j - 1];
				int up = dp[i - 1][j];

				dp[i][j] = Math.min(left, up) + grid[i][j];
			}
		}
		return dp[rows - 1][cols - 1];
	}

	public static void main(String[] args) {

		int[][] a = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		int res = minPathSum(a);

		System.out.println(res);
	}

}
