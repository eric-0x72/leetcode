package AprilChallenge;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * solution from https://www.youtube.com/watch?v=3JSddcFw8QM
 */
public class __FirstUniqueNumber2 {

	Map<Integer, Integer> map;

	public __FirstUniqueNumber2(int[] nums) {
		map = new LinkedHashMap<>();

		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
	}

	public int showFirstUnique() {
		for (int i : map.keySet()) {
			if (map.get(i) == 1)
				return i;
		}
		return -1;
	}

	public void add(int value) {
		map.put(value, map.getOrDefault(value, 0) + 1);
	}

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);

		// remove the first value in the queue
		q.remove(4);

		for (Integer i : q) {
			System.out.println(i);
		}

	}
}
