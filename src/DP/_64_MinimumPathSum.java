package dp;

public class _64_MinimumPathSum {

	public static int minPathSum(int[][] grid) {
		int rows = grid.length;
		int cols = grid[0].length;
		int[][] dp = new int[rows][cols];

		dp[0][0] = grid[0][0];

		// first column, |
		for (int i = 1; i < rows; i++)
			dp[i][0] = dp[i - 1][0] + grid[i][0];

		// first row, ---
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

	/**
	 * No extra space required
	 * 
	 */
	public static int minPathSum_1(int[][] grid) {
		int row = grid.length;
		int col = grid[0].length;

		for (int i = 1; i < row; i++)
			grid[i][0] += grid[i - 1][0];
		for (int j = 1; j < col; j++)
			grid[0][j] += grid[0][j - 1];

		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				int left = grid[i][j - 1];
				int up = grid[i - 1][j];
				grid[i][j] += Math.min(left, up);
			}
		}
		return grid[row - 1][col - 1];
	}

	public static void main(String[] args) {

		int[][] a = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		int res = minPathSum(a);

		System.out.println(res);
	}

}
