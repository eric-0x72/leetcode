package dp1_minPath;

import java.util.Arrays;

// min number of coins to make up amount 
// 1D dp problem
// similar: Q518 coin change2 which is a 2D dp
public class _322_CoinChange {

	public int coinChange(int[] coins, int amount) {

		int[] dp = new int[amount + 1];
		Arrays.fill(dp, -1); // -1 means amount can not achieve
		dp[0] = 0; // left blank

		// amount start from 1
		for (int i = 1; i <= amount; i++) {

			int min = Integer.MAX_VALUE;
			for (int j = 0; j < coins.length; j++) { // coin j

				// if amount >= coin j, and if amount i-coins[j] is achievable
				if (i - coins[j] >= 0 && dp[i - coins[j]] != -1) {
					// take min then plus 1
					min = Math.min(min, dp[i - coins[j]] + 1);
				}
			}
			dp[i] = min == Integer.MAX_VALUE ? -1 : min;
		}
		return dp[amount];
	}

}
