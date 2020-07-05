package contest;

public class __PassingInformation {

	// learned from ranking 3rd ÌìÌÁ
	// dp[moves, node]
	public int numWays_0(int n, int[][] relation, int k) {
		
		// new dp[6][11]
		int[][] dp = new int[k + 1][n];

		dp[0][0] = 1;
		for (int i = 0; i < k; i++) {
			for (int[] r : relation) {
				dp[i + 1][r[1]] += dp[i][r[0]];
			}
		}
		return dp[k][n - 1];
	}

	public int numWays(int n, int[][] relation, int k) {

	}

}
