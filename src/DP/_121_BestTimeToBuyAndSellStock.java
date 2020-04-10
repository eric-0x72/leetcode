
package dp;

public class _121_BestTimeToBuyAndSellStock {

    public static int maxProfit_bruteForce(int[] prices) {

        int n = prices.length;

        int profit = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int cur = prices[j] - prices[i];
                if (cur > profit)
                    profit = cur;
            }
        }
        return profit;
    }


    public static void main(String[] args) {

        int[] input = {7, 1, 5, 3, 6, 4};
        int res = maxProfit_bruteForce(input);
        System.out.println(res);
    }

}
