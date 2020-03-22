package heap_pq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class _347_TopKFrequentElement {

	public List<Integer> topKFrequent(int[] nums, int k) {

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int n : nums) {
			map.put(n, map.getOrDefault(n, 0) + 1);
		}

		PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
		for (int n : map.keySet()) {
			q.offer(n);
		}

		int i = 0;
		List<Integer> res = new ArrayList<>();
		while (i < k) {
			res.add(q.poll());
			i++;
		}
		return res ; 
	}
}
