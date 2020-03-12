
package DP;

public class _122_BestTimeToBuyAndSellStock2 {

	public static int maxProfit(int[] prices) {

		int n = prices.length;

		int res = 0;

		for (int i = 1; i < n; i++) {
			if (prices[i] > prices[i - 1])
				res += prices[i] - prices[i - 1];
		}
		return res;
	}

	public static void main(String[] args) {

		int[] input = { 7, 1, 5, 3, 6, 4 };
		int res = maxProfit(input);
		System.out.println(res);
	}

}
