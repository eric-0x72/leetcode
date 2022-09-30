package lcOffer;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class _59a_MaxSlidingWindow {

	/**
	 * brute force
	 */
	public int[] maxSlidingWindow(int[] nums, int k) {
		int n = nums.length;
		int windows = n - k + 1;
		int[] res = new int[windows];

		for (int i = 0; i < windows; i++) {

			int max = Integer.MIN_VALUE;
			for (int j = i; j < k + i; j++) {
				max = Math.max(max, nums[j]);
			}
			res[i] = max;
		}
		return res;
	}

	/**
	 * using an dequeue, linear time complexity
	 * 
	 * https://leetcode-cn.com/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/solution/java-dan-diao-shuang-xiang-lian-biao-hua-tu-xiang-/
	 */
	public int[] maxSlidingWindow_1(int[] nums, int k) {
		int n = nums.length;

		int index = 0;
		int[] res = new int[n - k + 1];

		// using dequeue to store index
		LinkedList<Integer> q = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			// remove indexes <= current element index
			while (!q.isEmpty() && nums[q.peekLast()] <= nums[i]) {
				q.pollLast();
			}
			
			// add to end of queue
			q.addLast(i); 

			// if window has passed head element
			if (q.peekFirst() == i - k) {
				q.pollFirst();
			}

			// if window is large enough
			if (i >= k - 1) {
				res[index] = nums[q.peekFirst()];
				index++;
			}

		}
		return res;
	}

	public static void main(String[] args) {

	}
}
