package twoPointers;

import java.util.ArrayDeque;
import java.util.Deque;

public class _1425_ConstrainedSubsequenceSum {

	// simple DP, TLE
	public int constrainedSubsetSum_0(int[] nums, int k) {

		int n = nums.length;
		int[] dp = new int[n];

		int res = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			int max = 0;

			for (int j = Math.max(i - k, 0); j < i; j++) {
				max = Math.max(max, dp[j]);
			}
			dp[i] = nums[i] + max;
			res = Math.max(res, dp[i]);
		}
		return res;
	}

	// monotonically decreasing queue, to reduce complexity
	// https://leetcode.com/problems/constrained-subsequence-sum/discuss/605822/Java-Decreasing-Monotonic-Queue-Clean-code-O(N)
	public int constrainedSubsetSum_1(int[] nums, int k) {

		int n = nums.length;
		int[] dp = new int[n];
		Deque<Integer> q = new ArrayDeque<>();
		int res = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			int max = Math.max(0, q.isEmpty() ? 0 : dp[q.peekFirst()]);
			dp[i] = nums[i] + max;
			res = Math.max(res, dp[i]);

			while (!q.isEmpty() && dp[i] >= dp[q.peekLast()]) {
				q.pollLast();
			}
			q.addLast(i);

			// if cur-qHead >= k, then pop head
			if (i - q.peekFirst() >= k) {
				q.removeFirst();
			}
		} // end for
		return res;
	}
}
