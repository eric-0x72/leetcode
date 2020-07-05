package dp1_minPath;

import java.util.Arrays;

// compute the number of combinations that make up target amount
// classic 01 knapsack problem, 2D dp
public class _518_CoinChange2 {

	public static int change(int amount, int[] coins) {

		int[][] dp = new int[coins.length + 1][amount + 1];

		// fill first column to 1
		for (int i = 0; i <= coins.length; i++) {
			dp[i][0] = 1;
		}

		for (int i = 1; i <= coins.length; i++) {
			for (int j = 1; j <= amount; j++) {

				// as compared to 01 knapsack, we add both consider and
				// not consider item i together
				dp[i][j] = dp[i - 1][j] // not consider coin i
						+ (j >= coins[i - 1] ? // if amount >= coin i, then can consider
								dp[i][j - coins[i - 1]] // consider coin i
								: 0); // else we cannot consider
			}
		}
		return dp[coins.length][amount];
	}

	// optimised 1D dp
	public static int change_2(int amount, int[] coins) {
		int[] dp = new int[amount + 1];
		dp[0] = 1;

		for (int coin : coins) {
			for (int j = coin; j <= amount; j++) { // build up amount
				dp[j] += dp[j - coin];
			}
		}
		return dp[amount];
	}

	public static void main(String[] args) {
		change(5, new int[] { 1, 2, 5 });
	}
}
