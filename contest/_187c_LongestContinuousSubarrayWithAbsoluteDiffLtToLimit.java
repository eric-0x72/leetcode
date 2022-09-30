package contest;

import java.util.ArrayDeque;
import java.util.Deque;

public class _187c_LongestContinuousSubarrayWithAbsoluteDiffLtToLimit {

	// https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/discuss/609743/Java-Detailed-Explanation-Sliding-Window-Deque-O(N)
	public int longestSubarray(int[] nums, int limit) {
		Deque<Integer> maxq = new ArrayDeque<>();
		Deque<Integer> minq = new ArrayDeque<>();
		int res = 1; // min length is array containing single element

		int l = 0;

		for (int r = 0; r < nums.length; r++) {
			// popmax q
			while (!maxq.isEmpty() && maxq.peekLast() < nums[r]) {
				maxq.removeLast();
			}
			maxq.addLast(nums[r]);

			// min q
			while (!minq.isEmpty() && minq.peekLast() > nums[r]) {
				minq.removeLast();
			}
			minq.addLast(nums[r]);

			// remove head for both q if hit limit
			while (maxq.peekFirst() - minq.peekFirst() > limit) {
				if (maxq.peekFirst() == nums[l])
					maxq.pollFirst();
				if (minq.peekFirst() == nums[l])
					minq.pollFirst();

				l++; // shift left pointer to right
			}
			res = Math.max(res, r - l + 1);
		} // end for
		return res;
	}

	public static void main(String[] args) {

	}
}
