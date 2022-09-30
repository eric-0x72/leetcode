package array;

import java.util.Arrays;
import java.util.HashMap;

public class _1331_RankTransfomOfArray {

	public static int[] arrayRankTransform(int[] arr) {
		int[] copy = arr.clone();
		System.out.println(Arrays.toString(copy));
		Arrays.sort(arr);

		HashMap<Integer, Integer> map = new HashMap<>();
		int rank = 1;
		for (int i = 0; i < arr.length; i++) {
			// map.putIfAbsent( arr[i], map.size()+1 )
			Integer a = map.putIfAbsent(arr[i], rank);
			if (a != null)
				rank += 1;
		}
		System.out.println(map);

		int[] res = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(copy[i]);
			res[i] = map.get(copy[i]);
		}
		return res;
	}

	public static void main(String[] args) {
		int[] in = { 40, 10, 20, 30 };
		int[] res = arrayRankTransform(in);
		System.out.println(Arrays.toString(res));
	}
}
