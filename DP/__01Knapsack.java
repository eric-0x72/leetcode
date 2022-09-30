package dp;

public class __01Knapsack {

	// https://www.geeksforgeeks.org/0-1-knapsack-problem-dp-10/
	public static int knapSack(int capacity, int weight[], int value[]) {

		int n = weight.length;
		// left first row and column black to 0
		int dp[][] = new int[n + 1][capacity + 1];

		for (int i = 1; i <= n; i++) { // row consider items
			for (int j = 1; j <= capacity; j++) { // column build up capacity

				// if item i within capacity
				if (weight[i - 1] <= j) {
					dp[i][j] = Math.max( // compare, take the max

							// value of item i, plus dp make space for item i
							value[i - 1] + dp[i - 1][j - weight[i - 1]], // consider item i
							dp[i - 1][j]); // not consider item i
				}

				// if no room for item i, then must not consider
				else {
					dp[i][j] = dp[i - 1][j];
				}

				// Math.max(dp[i-1][j],
				// weight[i-1] <= j ? value[i-1] + dp[i-1][j-weight[i-1]] : dp[i-1][j];
			}
		}
		return dp[n][capacity];
	}

	public static void main(String args[]) {

		// value and weight for each item
		int value[] = new int[] { 60, 100, 120 };
		int weight[] = new int[] { 10, 20, 30 };

		int capacity = 50; // capacity of bag
		int items = value.length; // number of items

		System.out.println(knapSack(capacity, weight, value)); // should get 220
	}
}
