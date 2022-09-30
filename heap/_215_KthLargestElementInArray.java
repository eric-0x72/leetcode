package heap;

import java.util.PriorityQueue;

public class _215_KthLargestElementInArray {

	public int findKthLargest(int[] nums, int k) {
		// default is min q
		PriorityQueue<Integer> q = new PriorityQueue<>();

		for (int i : nums) {
			q.add(i);

			// keep k largest element in the queue
			if (q.size() > k)
				q.poll();
		}
		return q.poll();
	}
}
