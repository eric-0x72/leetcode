package array;

public class _121_BestTimeToBuyAndSellStock {

	public int maxProfit(int[] prices) {
		int res = 0;
		int low = prices[0];

		// buy low, sell high
		for (int i = 1; i < prices.length; i++) {

			int cur = prices[i] - low;
			res = Math.max(cur, res);

			low = Math.min(low, prices[i]);
		}
		return res;
	}
}
