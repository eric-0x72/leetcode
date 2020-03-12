package frequent;

import java.util.Arrays;

public class _322_CoinChange {

//	public static int coinChange(int[] coins, int amount) {
//		return helper(coins, amount, amount, 0);
//	}
//
//	private static int helper(int[] coins, int amount, int left, int res) {
//		if (left == 0)
//			return res;
//
//		for (int c : coins) {
//			helper(coins, amount, left - c, res + 1);
//		}
//		return res;
//	}

	public static int coinChange(int[] coins, int amount) {

		int[] dp = new int[amount + 1];
		Arrays.fill(dp, -1);

		dp[0] = 0; // inference from the back

		for (int i = 1; i <= amount; i++) {

			int min = Integer.MAX_VALUE;

			for (int c : coins) {
				if (i - c >= 0 && dp[i - c] < min && dp[i - c] != -1)
					min = dp[i - c];
//				else
//					min = -2;
			}

			// dp[i] = (min == Integer.MAX_VALUE ? -1 : min + 1);
			if (min == Integer.MAX_VALUE)
				dp[i] = -1;
			else
				dp[i] = min + 1;
		}
		System.out.println(Arrays.toString(dp));
		return dp[amount];
	}

	public static void main(String[] args) {

		int[] coins = { 2 };
		int res = coinChange(coins, 3);

		System.out.println(res);

	}
}
