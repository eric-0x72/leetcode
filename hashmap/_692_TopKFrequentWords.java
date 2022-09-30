package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class _692_TopKFrequentWords {

	public List<String> topKFrequent(String[] words, int k) {

		// build a frequency map for each word
		Map<String, Integer> map = new HashMap<>();
		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}

		PriorityQueue<String> q = new PriorityQueue<>(
				(a, b) -> map.get(a).equals(map.get(b)) ? a.compareTo(b) : map.get(b) - map.get(a));

		for (String word : map.keySet()) {
			q.offer(word);
		}

		List<String> res = new ArrayList<>();

//		int i = 0;
//		while (i < k) {
//			res.add(q.poll());
//			i++;
//		}
		for (int i = 0; i < k; i++) {
			res.add(q.poll());
		}
		return res;
	}
}
