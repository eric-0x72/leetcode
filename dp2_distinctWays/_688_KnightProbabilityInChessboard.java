package dp2_distinctWays;

public class _688_KnightProbabilityInChessboard {

	// N*N board, K moves, initial position r,c
	public double knightProbability(int N, int K, int r, int c) {

		int[][] d = { { -2, 1 }, { -1, 2 }, { 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 }, { -1, -2 }, { -2, -1 } };
		double[][] dp = new double[26][26]; // n is in [1, 25]
		dp[r][c] = 1;

		// for every position on the board, we try all other positions
		// that can reach this on previous move
		for (int k = 0; k < K; k++) {

			double[][] dpnew = new double[26][26];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {

					// from current i,j, we change probability in 8 directions
					for (int dir = 0; dir < 8; dir++) {
						int newr = i + d[dir][0]; // new row position
						int newc = j + d[dir][1]; // new col position

						if (newr >= 0 && newc >= 0 && newr < N && newc < N) {
							dpnew[newr][newc] += dp[i][j] / 8.0;
						}
					}
				}
			}
			dp = dpnew;
		}

		double res = 0.0;
		for (double[] row : dp) {
			for (double e : row) {
				res += e;
			}
		}
		return res;
	}
}
