package contest;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class _1331_RankTransformOfArray {

	public int[] arrayRankTransform(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();

		int[] sorted = Arrays.copyOf(arr, arr.length);
		Arrays.sort(sorted);

		for (int x : sorted) {
			map.putIfAbsent(x, map.size() + 1); // attention of putIfAbsent!!
		}

		// copy to original arr
		for (int i = 0; i < arr.length; i++) {
			arr[i] = map.get(arr[i]);
		}
		
		return arr;
	}
}
