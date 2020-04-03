package DP;

import java.util.Arrays;

public class _322_CoinChange {

	/**
	 * bottom up DP
	 * 
	 */
	public static int coinChange_1(int[] coins, int amount) {
		int max = amount + 1; // an impossible number

		// array to store min number of coins to reach amount
		int[] dp = new int[amount + 1]; // size [0, amount]
		Arrays.fill(dp, max);

		dp[0] = 0;
		for (int i = 0; i <= amount; i++) {

			// go through all coins
			for (int coin : coins) {

				// can only try coin_j if <= current amount
				if (coin <= i)
					// take current coin, then the way to amount i is dp[i-coin]+1
					dp[i] = Math.min(dp[i], dp[i - coin] + 1);
			}
		}
		// System.out.println(Arrays.toString(dp));
		return dp[amount] > amount ? -1 : dp[amount];
	}

	// ********************************************************
	/**
	 * backtracking, TLE error
	 * 
	 */
	public static int coinChange_2(int[] coins, int amount) {
		return helper_2(coins, amount);
	}

	private static int helper_2(int[] coins, int remain) {
		if (remain < 0)
			return -1;
		if (remain == 0)
			return 0;

		int min = Integer.MAX_VALUE;
		for (int coin : coins) {
			int res = helper_2(coins, remain - coin);

			if (res >= 0 && res < min)
				min = res + 1;
		}
		return min == Integer.MAX_VALUE ? -1 : min;
	}

	// ********************************************************
	/**
	 * top down DP, memo search
	 * 
	 */
	static int[] memo;

	public static int coinChange_3(int[] coins, int amount) {
		memo = new int[amount + 1];
		memo[0] = -1;

		return helper_3(coins, amount);
	}

	public static int helper_3(int[] coins, int remain) {
		if (remain < 0)
			return -1; // impossible
		if (remain == 0)
			return 0; // reach leaf

		if (memo[remain] != 0)
			return memo[remain];

		int min = Integer.MAX_VALUE;
		for (int coin : coins) {

			// do the recursion
			int res = helper_3(coins, remain - coin);

			// if possible, and smaller then update min
			if (res >= 0 && res < min) //
				min = res + 1;
		}
		memo[remain] = (min == Integer.MAX_VALUE) ? -1 : min;
		return memo[remain];
	}

	// ********************************************************

	public static void main(String[] args) {
		int[] coins = { 1, 2, 5 };
		int res = coinChange_3(coins, 11);
		System.out.println(Arrays.toString(memo));

		System.out.println(res);
	}
}
