package hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class _1331_RankTransformOfArray {

	public static int[] arrayRankTransform(int[] arr) {
		int[] sorted = Arrays.copyOf(arr, arr.length);

		Arrays.sort(sorted);

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int e : sorted)
			// If two elements are equal, their rank must be the same
			// note the putIfAbsent here! only record the first ranking, don't put twice!!
			map.putIfAbsent(e, map.size() + 1); // size()+1 skip the previous duplicate ranking

		// recover array from hashmap
		for (int i = 0; i < arr.length; i++)
			arr[i] = map.get(arr[i]);

		System.out.println(map);
		return arr;
	}

	public static void main(String[] args) {
		int[] a = { 40, 10, 20, 30, 30 };
		int[] res = arrayRankTransform(a);
		System.out.println(Arrays.toString(res));
	}

}
