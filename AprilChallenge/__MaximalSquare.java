package AprilChallenge;

public class __MaximalSquare {

	private int min3(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}

	public int maximalSquare(char[][] matrix) {

		int m = matrix.length;
		int n = matrix[0].length;

		int[][] dp = new int[m + 1][n + 1];
		int maxEdge = 0;

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {

				if (matrix[i - 1][j - 1] == '1') {
					dp[i][j] = min3(dp[i][j - 1], dp[i - 1][j - 1], dp[i - 1][j]) + 1;
					maxEdge = Math.max(maxEdge, dp[i][j]);
				}
			}
		}
		return maxEdge * maxEdge;
	}
}
