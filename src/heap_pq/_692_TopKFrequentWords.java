package heap_pq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class _692_TopKFrequentWords {

	public List<String> topKFrequent(String[] words, int k) {

		Map<String, Integer> map = new HashMap<>();

		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}

		PriorityQueue<String> q = new PriorityQueue<>(
				(a, b) -> 
				!map.get(a).equals(map.get(b)) ? 
				map.get(b) - map.get(a) // if count not equal, return more frequent word
				: a.compareTo(b) // if count equal, return alphabetical order
		);
		
		for(String word: map.keySet()) // only unique words
			q.offer(word) ;
		
		List<String> res = new ArrayList<>();
		int i = 0;
		while (i < k) {
			res.add(q.poll());
			i++;
		}
		return res ;
	}

	public static void main(String[] args) {
		System.out.println("abc".compareTo("abcd"));
	}
}
