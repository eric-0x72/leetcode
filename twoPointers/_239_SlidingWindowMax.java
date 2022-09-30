package twoPointers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class _239_SlidingWindowMax {

	public int[] maxSlidingWindow(int[] nums, int k) {
		int n = nums.length;
		int index = 0;
		int[] res = new int[n - k + 1];
		Deque<Integer> q = new ArrayDeque<>();

		for (int i = 0; i < n; i++) {
			// remove small tail if <= current element i
			while (!q.isEmpty() && nums[q.peekLast()] <= nums[i]) {
				q.pollLast();
			}

			q.addLast(i); // add i

			// if head of window not belong to current window, then remove
			// constraint: j-i <= k, where qHead is i, current i is j
			// include == since we clear for next
			if (i - q.peekFirst() >= k) {
				q.pollFirst();
			}

			// if window grow to correct size, then output first result
			if (i >= k - 1) {
				res[index++] = nums[q.peekFirst()];
			}

		} // end for
		return res;
	}

}
