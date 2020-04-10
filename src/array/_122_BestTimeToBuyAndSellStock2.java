package array;

import java.util.Arrays;

public class _122_BestTimeToBuyAndSellStock2 {

	public int maxProfit(int[] prices) {
		int res = 0;
		if (prices.length == 0)
			return res;

		// if the right is continuously going up hill, added them
		// monotonously increasing
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1])
				res += prices[i] - prices[i - 1];
		}
		
		Arrays.sort( prices);
		return res;
	}
}
